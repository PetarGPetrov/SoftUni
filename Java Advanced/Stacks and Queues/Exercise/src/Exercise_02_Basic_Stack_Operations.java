import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        int n = scan.nextInt();   // how many to push
        int s = scan.nextInt();   // how many to pop
        int x = scan.nextInt();   // the number we are checking for


        for (int i = 1; i <= n; i++) {
            numbers.push(scan.nextInt());


        }

        for (int i = 1; i <= s; i++) {
            numbers.pop();

        }
        if (numbers.contains(x)){
            System.out.println("true");
        }else if (numbers.isEmpty()){
            System.out.println("0");

        }else{

            System.out.println(Collections.min(numbers));
        }
    }
}
