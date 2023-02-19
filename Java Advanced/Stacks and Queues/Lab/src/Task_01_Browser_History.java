import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_01_Browser_History {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<String> history = new ArrayDeque<>();

        String input = scan.nextLine();
        while (!input.equals("Home")){
            if (input.equals("back")){
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");
                    input = scan.nextLine();
                    continue;
                }
                history.pop();

            }else{
                history.push(input);
            }
            System.out.println(history.peek());
            input = scan.nextLine();

        }
    }
}
