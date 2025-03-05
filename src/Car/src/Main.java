//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2020);
        System.out.println(car);

        Person person = new Person("Christo", "T", "Marrero", 38);
        Car car1 = new Car("Mercedes", 2022, person);
        car.startEngine();
        car.stopEngine();

        System.out.println(car1);


    }





}