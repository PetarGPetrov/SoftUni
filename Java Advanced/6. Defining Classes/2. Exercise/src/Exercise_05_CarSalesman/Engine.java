package Exercise5_CarSalesman;

public class Engine {

    
    private final String model;
    private final int power; 
    private final int displacement; 
    private final String efficiency; 

    
    public Engine(String model, int power, int displacement, String efficiency) {
       
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
