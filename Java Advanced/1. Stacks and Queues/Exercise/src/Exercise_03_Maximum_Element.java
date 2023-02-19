import java.util.*;

public class Exercise_03_Maximum_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque deque = new ArrayDeque<>();

        int n = Integer.parseInt(scan.nextLine());
        //System.out.println(commands + " commands");


        for(int i = 0; i < n; i++){
            String command = scan.nextLine();
            if(command.equals("2")){
                deque.pop();
            }else if(command.equals("3")){
                if (deque.size() > 0){
                    System.out.println(Collections.max(deque));
                }
            } else {
                int x = Integer.parseInt(command.split("\\s+")[1]);
                deque.push(x);
            }





        }

    }
}
