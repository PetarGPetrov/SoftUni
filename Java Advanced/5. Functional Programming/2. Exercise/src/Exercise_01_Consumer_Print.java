import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Exercise_01_Consumer_Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] names = scan.nextLine().split("\\s+");


        Consumer<String[]> printArray = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };
    
        printArray.accept(names);
    }
}
