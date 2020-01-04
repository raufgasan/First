package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        
        
        
        double [] price = {99.23, 11.99, 100.23, 99.99, 56.34};

        for (int x = 0; x <price.length ; x++) {
            double echprice = price[x];
            System.out.println("echprice = " + echprice);
            
        }
        System.out.println("======================================");
        for ( double eschPrice: price         ){


            System.out.println("eschPrice = " + eschPrice);
        }
        
    }
    
    
}
