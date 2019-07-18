class Escape extends Car {
    public Escape(){
        super("escape", 4, 12500);
    }

    public void accelerate(int desiredSpeed) {
        System.out.println("You accelerated " + ((desiredSpeed * 2) - super.getCurrentSpeed()) + "mph.");
        super.setCurrentSpeed(super.getCurrentSpeed() + (desiredSpeed * 2));
        System.out.println("Your new current speed is " + super.getCurrentSpeed());
    }
}

class CRV extends Car {
    public CRV(){
        super("crv", 6, 15000);
    }

    @Override
    public void accelerate(int desiredSpeed) {
        System.out.println("You accelerated " + ((desiredSpeed * 2) - super.getCurrentSpeed()) + "mph.");
        super.setCurrentSpeed(super.getCurrentSpeed() + (desiredSpeed * 2));
        System.out.println("Your new current speed is " + super.getCurrentSpeed());
    }

    @Override
    public void brake(int desiredSpeed){
        super.setCurrentSpeed(super.getCurrentSpeed() - (desiredSpeed * 2));
        System.out.println("You decreased your speed by " + (super.getCurrentSpeed() - (desiredSpeed * 2)) + "mph. Your new current speed is " + super.getCurrentSpeed());
    }
}

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String gearType;
    private int cost;
    private int currentSpeed;

    public Car() {
    }

    public Car(String name, int cylinders, int cost) {
        this.name = name;
        this.engine = false;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.gearType = "automatic";
        this.cost = cost;
        this.currentSpeed = 0;
    }

    public void startEngine() {
        if(engine){
            System.out.println("Engine is already running!");
        } else {
            engine = true;
            System.out.println("Engine has started...");
        }
    }

    public void stopEngine() {
        if(engine){
            engine = false;
            System.out.println("Engine has stopped.");
        } else {
            System.out.println("Engine is already off...");
        }
    }

    public void accelerate(int desiredSpeed) {
        System.out.println("You accelerated " + (desiredSpeed - currentSpeed) + "mph");
        currentSpeed += desiredSpeed;
        System.out.println("Your new current speed is " + currentSpeed);
    }

    public void brake(int desiredSpeed) {
        System.out.println("You decreased your speed to " + (currentSpeed - desiredSpeed) + "mph");
        currentSpeed -= desiredSpeed;
        System.out.println("Your new current speed is " + currentSpeed);
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getGearType() {
        return gearType;
    }

    public int getCost() {
        return cost;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
