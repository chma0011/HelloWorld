public class Car {
    String brand;
    int year;
    Person owner;

    public Car(String brand, int year, Person owner){
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }


    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "brand: " + brand + "\n" +
                "year: " + year + "\n" +
                owner;


    }

    public void startEngine(){
        System.out.println("Engine starts...");
    }

    public void stopEngine(){
        System.out.println("Engine stops...");
    }

    public String getOwner() {
        return owner.getFullName();
    }
}
