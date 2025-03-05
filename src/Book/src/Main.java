//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book halfdansABC = new Book();
        halfdansABC.setTitle("Halfdans ABC.");
        halfdansABC.setAuthor("Halfdan Rasmusen");
        halfdansABC.setPrice(110.5);

        System.out.println(halfdansABC.getTitle());
        System.out.println(halfdansABC.getAuthor());
        System.out.println(halfdansABC.getPrice()+" Kr");

        


    }
}