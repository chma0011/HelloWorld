package models;

public class motorcycle extends Vehicle {

    private int engineSize;

    public motorcycle(String licensePlate, String brand, int year, int mileage, int engineSize){
        super(licensePlate, brand, year, mileage);
        this.engineSize = engineSize;
    }


    public int getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(){
        this.engineSize = engineSize;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println(engineSize);
    }
}
