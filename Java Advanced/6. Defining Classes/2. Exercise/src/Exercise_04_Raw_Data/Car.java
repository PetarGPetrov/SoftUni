package RawData;

import java.util.List;

public class Car { 
    private String model;
    private Engine engine;
    private Cargo cargo;
    List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }



    public void extract(String command) {
        switch (command) {
            case "fragile":
                for (Tire tire : tires) {
                    double pressure = tire.getTirePressure();
                    if (pressure < 1) {
                        System.out.println(model);
                        break;
                    }
                }
                
                break;
            case "flamable":
                if (engine.getEnginePower() > 250) {
                    System.out.println(model);

                }
                break;

        }
    }
}