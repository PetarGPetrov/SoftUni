import java.util.*;

public class Exercise_01_Reverse_Numbers_With_a_Stack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque <String> deque = new ArrayDeque<>();

        String[] numbers = scan.nextLine().split(" ");
        List<String> newNumbers = Arrays.asList(numbers);
        deque.addAll(newNumbers);

        while (!deque.isEmpty()){
            System.out.print(deque.pollLast() + " ");
        }

        }
    }

