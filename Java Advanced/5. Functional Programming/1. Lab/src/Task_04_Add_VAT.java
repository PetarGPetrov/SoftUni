import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Task_04_Add_VAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<String, Double> parseToDouble = str -> Double.parseDouble(str);
        UnaryOperator<Double> vatAdd = d -> d * 1.2;
        Consumer<Double> print = number -> System.out.printf("%.2f%n", number);

        System.out.println("Prices with VAT:");
        Arrays.stream(scan.nextLine().split(", "))
                .map(j -> parseToDouble.apply(j))
                .map(price -> vatAdd.apply(price))
                .forEach(priceWithVat -> print.accept(priceWithVat));
        
    }
}
