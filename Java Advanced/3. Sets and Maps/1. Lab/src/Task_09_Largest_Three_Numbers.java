import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_09_Largest_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] input = scan.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String element : input) {
            numbers.add(Integer.parseInt(element));   

        List<Integer> sorting = numbers
                .stream()
                .sorted((l, r) -> r.compareTo(l))  
                .collect(Collectors.toList());

        int quantity = Math.min(sorting.size(), 3); 
        for (int i = 0; i < quantity; i++) {
            System.out.print(sorting.get(i) + " "); 
        }


    }
}
