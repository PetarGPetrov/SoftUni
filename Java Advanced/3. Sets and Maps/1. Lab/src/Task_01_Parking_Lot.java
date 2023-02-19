import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_01_Parking_Lot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();                     
                                                          
                                                          
                                                            


        Set<String> cars = new LinkedHashSet<>();    


        while (!input.equalsIgnoreCase("End")){
            String[] partsOfInput = input.split(", ");
            String direction = partsOfInput[0];                    
            String carLicencePlate = partsOfInput[1];              
            if (direction.equalsIgnoreCase("in")){
                cars.add(carLicencePlate);
            }else if (direction.equalsIgnoreCase("out")){
                cars.remove(carLicencePlate);

            }

            input = scan.nextLine();
        }


        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");

        }else {
            cars.forEach(car -> System.out.println(car));
                    

            }

        }
    }

