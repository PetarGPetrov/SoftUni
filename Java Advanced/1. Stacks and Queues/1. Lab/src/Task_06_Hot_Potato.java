import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task_06_Hot_Potato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(" ");

        int steps = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids, names);

        while (kids.size() > 1){
            for (int i = 1; i < steps; i++) {
                String child = kids.poll();
                kids.offer(child);
            }

        System.out.println("Removed " + kids.poll());
    }
        System.out.println("Last is " + kids.poll());

    }
}
