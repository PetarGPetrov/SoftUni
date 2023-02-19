package Exercise5_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      
        List<Engine> engines = new ArrayList<>();
        int enginesCount = Integer.parseInt(scan.nextLine());
        for (int engineCount = 1; engineCount <= enginesCount ; engineCount++) {
          
            String [] engineData = scan.nextLine().split("\\s+");
            
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            
            int displacement = 0;
            String efficiency = null;

           
            if (engineData.length == 4) {
               
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3){
               
                
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }

            }

         
            Engine engine = new Engine(model, power, displacement, efficiency);
            
            engines.add(engine);
        }

       
        int carsCount = Integer.parseInt(scan.nextLine());
        for (int carCount = 1; carCount <= carsCount; carCount++) {
            
            String[] carData = scan.nextLine().split("\\s+");
          
            String carModel = carData[0];
            String engineModel = carData[1]; 
            
            int weight = 0;
            String color = null;

           
            if (carData.length == 4) {
                
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {
              
                if (Character.isDigit(carData[2].charAt(0))) {
                   
                    weight = Integer.parseInt(carData[2]);
                } else {
                   
                    color = carData[2];
                }
            }

            Engine carEngine = null;
            for (Engine engine : engines) {
                if (engineModel.equals(engine.getModel())) {
                    carEngine = engine;
                    break;
                }
            }

            Car car = new Car(carModel, carEngine, weight, color);
            System.out.print(car.toString());
        }
        }
}
