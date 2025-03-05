public class Car {
    String brand;
    int year;
    Person owner;

    public Car(String brand, int year, Person owner) {
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;



    }

    public String getFullName(){
        return owner.getFullName();
    }


    public String toString() {
        return brand + " " + "fra året" + " " + year;
    }
    public void startEngine() {
        System.out.println("The engine starts");

    }
    public void stopEngine(){
        System.out.println("The engine stops");
    }


}
