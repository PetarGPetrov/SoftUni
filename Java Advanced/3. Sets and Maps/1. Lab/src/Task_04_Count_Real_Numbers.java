import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_04_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> occurrences = new LinkedHashMap<>(); 

        String[] numbers = scan.nextLine().split(" ");

        for (String number : numbers ) {   
            double current = Double.parseDouble(number);
            if(occurrences.containsKey(current)){         
                Integer count = occurrences.get(current);
                occurrences.put(current, count + 1);
            }else{
                occurrences.put(current, 1);
            }
            
        }
        for (Double currentNumber :occurrences.keySet()) {
            System.out.printf("%.1f -> %d%n", currentNumber,occurrences.get(currentNumber));
            
        }
    }
}
