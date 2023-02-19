import java.util.ArrayDeque;
import java.util.Scanner;

public class Task_05_Printer_Queue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scan.nextLine();

        while (!input.equals("print")){
            if (!input.equals("cancel")){
                queue.offer(input);
            }
            if (input.equals("cancel")){
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");

                }else{
                    System.out.println("Canceled " + queue.poll() );
                }

            }

            input = scan.nextLine();

        }
        while(!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }





    }
}
