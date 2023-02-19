import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task_05_Filter_By_Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> people = new LinkedHashMap<>();  

        int count = Integer.parseInt(scan.nextLine()); 


        for (int i = 0; i < count; i++) {  
            String[] input = scan.nextLine().split(", ");

            people.put(input[0], Integer.parseInt(input[1])); 
        }

        String condition = scan.nextLine(); 
        int ageLimit = Integer.parseInt(scan.nextLine());  
        String format = scan.nextLine();  

        Predicate<Integer> filter = getPredicate(condition, ageLimit);
        Consumer<Map.Entry<String, Integer>> print = getPrintConsumer(format);

        people
                .entrySet()
                .stream()
                .filter(entry -> filter.test(entry.getValue()))
                .forEach(entry -> print.accept(entry));
    }

    private static Consumer<Map.Entry<String, Integer>> getPrintConsumer(String format) {
        switch (format) {
            case "name":
                return e -> System.out.println(e.getKey());
            case "age":
                return e -> System.out.println(e.getValue());
            case "name age":
            case "age name":
                return e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());
        }

        throw new RuntimeException("Bad format!");
    }


    private static Predicate<Integer> getPredicate(String condition, int ageLimit) {
        if (condition.equals("older")) {
            return x -> x >= ageLimit;
        } else if (condition.equals("younger")) {
            return x -> x <= ageLimit;
        }

        throw new RuntimeException("Bad condition! Use 'older' or 'younger'");
    }
}
