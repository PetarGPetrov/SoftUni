import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task_06_Product_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<String, Map<String, Double>> storeAndProducts = new TreeMap<>();  
        String input = scan.nextLine();                                        

        while (!input.equals("Revision")) {
            String shopName = input.split(", ")[0]; 
            String productName = input.split(", ")[1];  
            double priceOfProduct = Double.parseDouble(input.split(", ")[2]);  
            storeAndProducts.putIfAbsent(shopName, new LinkedHashMap<>());  
            Map<String, Double> products = storeAndProducts.get(shopName); 
            products.put(productName, priceOfProduct);

            input = scan.nextLine();
        }


        for (Map.Entry<String, Map<String, Double>> entry : storeAndProducts.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> products : entry.getValue().entrySet()) {
                String print = String.format("Product: %s, Price: %.1f", products.getKey(), products.getValue());
                System.out.println(print);
            }

        }
    }
}
