package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
//        System.out.println(s1.allProducts);

//        s1.allProducts.add(new Product("imac", 3999));
//        System.out.println(s1.allProducts);
        System.out.println("s1 = " + s1);


        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5),
                new Product("muffins", 5),
                new Product("nut", 7),
                new Product("Frappecino", 8),
                new Product("double shot", 15));

        Store s2 = new Store("Denis Store", denisList);

        System.out.println("s2 = " + s2);

        Product p1 = new Product("CheeseCake", 10);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);
        s2.addProduct("Latte", 3);
        System.out.println("s2 = " + s2);

        System.out.println("s2.getProductCount() = " + s2.getProductCount());

        s2.displayProducts();

        s2.removeProduct(p1);
        System.out.println("Do we have cheesecake with price 10$ = "
                + s2.checkIfProductExists(p1));
        System.out.println("Where is cheesecake with price 10$ = "
                + s2.indexOfProduct(p1));
//        s2.removeProduct(p1);




        List<Product> denisList2 = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));

        Store s3 = new Store("Denis Store", denisList2);
        System.out.println("s2 = " + s3);
        System.out.println("s2.findSumOfAllProductPrice() = " + s3.findSumOfAllProductPrice());
        System.out.println("s2.getAveragePrice() = " + s3.getAveragePrice());
        System.out.println("Most Expensive Product = " + s3.getMostExpensiveProduct());

        System.out.println("More Than Average Price() = \n" + s3.getAllProductsMoreThanAveragePrice());


    }


}
