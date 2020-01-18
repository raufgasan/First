package day41;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setName("Iphone");
        p1.setPrice(699);

        System.out.println(p1.getName());
        System.out.println(p1.getPrice());

    }
}
