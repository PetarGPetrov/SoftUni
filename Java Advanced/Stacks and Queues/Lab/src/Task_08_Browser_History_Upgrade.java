import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_08_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();
        ArrayDeque<String> recent = new ArrayDeque<>();


        String input = scan.nextLine();
        while (!input.equals("Home")){
            if (input.equals("back")){
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");
                    input = scan.nextLine();

                    continue;


                }else{

                    recent.addFirst(history.peek());
                    history.pop();


                }



            }else if (input.equals("forward")){
                if (recent.isEmpty()){
                    System.out.println("no next URLs");
                }else{
                    history.push(recent.peek());
                    System.out.println(recent.pollFirst());

                    //recent.clear();

                }
                input = scan.nextLine();
                continue;

            }else{
                recent.clear();
                history.push(input);

            }

            System.out.println(history.peek());
            input = scan.nextLine();

        }
    }
}


