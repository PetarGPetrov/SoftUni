import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task_03_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Predicate<String> startsWithUppercase = word -> Character.isUpperCase(word.charAt(0));  
        Consumer<String> print = j -> System.out.println(j);  

        List<String> wordsWithUppercase = Arrays.stream(scan.nextLine().split(" "))   
                .filter(w -> startsWithUppercase.test(w))  
                .collect(Collectors.toList());   
        System.out.println(wordsWithUppercase.size());  

        wordsWithUppercase.forEach(elem -> print.accept(elem)); 

       

    }
}
