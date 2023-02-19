import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_05_Balanced_Parentheses_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        String input = scan.nextLine();

        boolean ifBalanced = false;

        for (char bracket :input.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '['){
                openBrackets.push(bracket);

            }else if(bracket == ')' || bracket == '}' || bracket == ']'){
                //char openBracket = openBrackets.pop();
                if(openBrackets.isEmpty()){
                    ifBalanced = false;
                    break;
                }
                char openBracket = openBrackets.pop();
                if (openBracket == '(' && bracket == ')'){
                    ifBalanced = true;

                } else if (openBracket == '{' && bracket == '}'){
                    ifBalanced = true;

                } else if (openBracket == '[' && bracket == ']'){
                    ifBalanced = true;

                }else{
                    ifBalanced = false;
                    break;
                }

            }

        }

        if (ifBalanced){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }
    }
}
