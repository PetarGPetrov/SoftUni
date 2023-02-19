package Exercise3_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCars = Integer.parseInt(scan.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
       
        for(int i = 1; i <= countCars; i++){
            String[] data = scan.nextLine().split("\\s+");  
            String model = data[0];
            double fuelAmount = Integer.parseInt(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, priceFuelPerKm); 
            cars.put(model, car); 

        }
        String command = scan.nextLine();
        while(!command.equalsIgnoreCase("end")){
            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);


            Car carToDrive = cars.get(carModelToDrive); 

            if (!carToDrive.drive(kmToDrive)){
                
                System.out.println("Insufficient fuel for the drive");
            }

            command = scan.nextLine();
        }
        for(Car car : cars.values()){
            
            System.out.println(car.toString());
        }
    }
}
