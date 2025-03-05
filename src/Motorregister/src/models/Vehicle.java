package models;

public class Vehicle {
    private String licensePlate;
    private String brand;
    private int year;
    private int mileage;

    public Vehicle(String licensePlate, String brand, int year, int mileage){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public void drive(int km){
        mileage = mileage + km;

    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public  String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void printInfo(){
        System.out.println(licensePlate +brand + year + mileage);

    }
}
