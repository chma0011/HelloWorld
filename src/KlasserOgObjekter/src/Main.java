import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        String brand = "Audi";
        int year = 2020;
        Person owner = new Person("Christopher","Thomas","Marrero",35);


        Car car1 = new Car(brand,year);
        System.out.println(car1);
        Car car2 = new Car(brand,year,owner);

        car1.startEngine();
        car1.stopEngine();

        Person person1 = new Person("Christopher", "Thomas", "Marrero", 38);
        person1.getFullName();
        Person person2 = new Person("Adam","Hans","Jensen",35 );
        System.out.println(person1);
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
    }





}
