import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Exercise_06_Predicate_For_Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int letters = Integer.parseInt(scan.nextLine());

       

        String[] names = scan.nextLine().split("\\s+");


        Predicate<String> checkLetter = name -> name.length() <= letters;  
       
        Arrays.stream(names).filter(checkLetter) 
                .forEach(System.out::println); 
    }
}

