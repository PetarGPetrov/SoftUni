import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_01_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scan.nextLine().split(", ")).map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());

        inputNumbers.removeIf(number -> {
            return number % 2 !=0;
        });
        separator(inputNumbers);
        System.out.println();


        List<Integer> sortedNumbers = inputNumbers
                .stream()
                .sorted()
                .collect(Collectors.toList());

        separator(sortedNumbers);
    }

    private static void separator(List<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i));

            if(i < numbers.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
