package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceList2 {
    public static void main(String[] args) {


//        Two way to create ArrayList

//        ArrayList<String>teamMates=new ArrayList<>();

        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("\n\tpriceList = " + priceList+"\n");
        // change the third price to 10 $

        priceList.set(2,10.0);
        System.out.println("\n\tItem 3 new price= " + priceList.get(2));


        // Add 4 dollar to first price
        priceList.set(0,priceList.get(0)+4);
        System.out.println("\n\tAdd 4 on first Item = " + priceList.get(0));


        // change last price to sum of first and second price

        priceList.set(priceList.size()-1,priceList.get(0)+priceList.get(1));
        System.out.println("\n\tLast price sum = " + priceList.get(priceList.size()-1));

        //give %40 off to second price

        priceList.set(1,priceList.get(1)* 0.6);
        System.out.println("\n\t40 % to second price = " + priceList.get(1));

        //double the value of each and every price in the list :
        for (int i = 0; i <priceList.size() ; i++) {

            priceList.set(i,priceList.get(i)*2);

        }
        System.out.println("\n\tpriceList doubling but 2 = " + priceList);


        // cut the price in to half if the price more than 20$


        for (int i = 0; i <priceList.size() ; i++) {
            if (priceList.get(i)>20){
                priceList.set(i,priceList.get(i)/2);
            }

        }
        System.out.println("\n\thalf price for item more than 20$ = " + priceList.toString());

        // swap the first value with the last value

        Double temp= priceList.get(0);
        priceList.set(   0    ,     priceList.get(priceList.size()-1)   );
        priceList.set((priceList.size()-1),temp);

        System.out.println("\n\tPrice List after swapping first and last value:"+ priceList);


        for (int i = 0; i <priceList.size()/2 ; i++) {

            Double temp1= priceList.get(i);
            priceList.set(   i    ,     priceList.get(priceList.size()-i)   );
            priceList.set((priceList.size()-i),temp);

        }
        System.out.println(priceList);
    }
}
