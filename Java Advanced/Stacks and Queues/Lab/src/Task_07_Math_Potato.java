import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Task_07_Math_Potato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] names = scan.nextLine().split(" ");

        int steps = Integer.parseInt(scan.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, names);

        int momentSteps = 1;
        while (kids.size() > 1) {
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }

            if (isPrime(momentSteps)) {
                System.out.println("Prime " + kids.peek());
            } else {
                String removedKid = kids.poll();
                System.out.println("Removed " + removedKid);
            }

            momentSteps++;
        }

        System.out.println("Last is " + kids.poll());
    }
    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
