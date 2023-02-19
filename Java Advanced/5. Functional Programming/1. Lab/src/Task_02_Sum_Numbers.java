import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task_02_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<String, Integer> parseToInt = s -> Integer.parseInt(s); 

        List<Integer> numInput = Arrays.stream(scan .nextLine().split(", ")) 
                .map(elem -> parseToInt.apply(elem))     
                .collect(Collectors.toList());  

        int sum = numInput
                .stream()
                .mapToInt(a -> a) 
                .sum(); 

        System.out.println("Count = " + numInput.size());
        System.out.println("Sum = " + sum);
    }
}
