import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Exercise_02_Knights_of_Honour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split("\\s+");



    

        Consumer<String> printName = name -> System.out.println("Sir " + name);
     
        Arrays.stream(names).forEach(printName); 
    }
}
