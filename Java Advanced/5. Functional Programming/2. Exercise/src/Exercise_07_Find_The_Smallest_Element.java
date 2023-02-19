import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise_07_Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());  


        Consumer<List<Integer>> righmostIndex = List -> {
            int minEl = Collections.min(List);
          
            System.out.println(List.lastIndexOf(minEl));  
        };

        righmostIndex.accept(numbers);  



    }
}
