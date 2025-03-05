//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product acer = new Product();
        acer.setPrice(100);
        acer.setProductCode(1000);
        acer.setProductName("Acer");

        System.out.println(acer.getPrice());
        System.out.println(acer.getProductName());
        System.out.println(acer.getProductCode());

        acer.applyDiscount(10);
        System.out.println(acer.getPrice());

    }
}