import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_04_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque stack = new ArrayDeque<>();

        int n = scan.nextInt(); // how many elements to push
        int s = scan.nextInt(); // how many to pop
        int x = scan.nextInt();


        for(int i = 0; i < n; i++){
            int p = scan.nextInt();
            stack.push(p);

        }

        for(int i = 0; i < s; i++){
            stack.pollLast();

        }

        if(stack.contains(x)){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println(0);

        }
        else{
            System.out.println(Collections.min(stack));
        }


    }
}