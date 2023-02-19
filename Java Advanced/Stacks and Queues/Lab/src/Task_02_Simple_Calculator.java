import java.util.*;

public class Task_02_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String inputExpression = scan.nextLine();
        String[] expressionDivided = inputExpression.split(" ");
        List<String> partsList = Arrays.asList(expressionDivided);

        Collections.reverse(partsList);

        for (String part : partsList) {
            stack.push(part);
            
        }

        while (stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            int result = 0;

            switch (operation){
                case "+":
                    result = firstNum + secondNum;

                    break;
                case "-":
                    result = firstNum - secondNum;

                    break;

            }
            stack.push("" + result);
        }

        System.out.println(stack.peek());

    }
}
