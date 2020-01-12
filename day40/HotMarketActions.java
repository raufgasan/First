package day40;

import java.util.ArrayList;

public class HotMarketActions {
    public static void main(String[] args) {


        Offer o1 = new Offer();

        o1.company = "Apple";
        o1.location ="Austin";
        o1.isFullTime=true;
        o1.salary=140000;
        o1.displayInFormation();



        Offer o2 = new Offer();

        o2.company = "Amazon";
        o2.location ="Seattle";
        o2.isFullTime=true;
        o2.salary=160000;
        o2.displayInFormation();

        Offer o3 = new Offer();

        o3.company = "Den";
        o3.location ="NewYork";
        o3.isFullTime=true;
        o3.salary=120000;
        o3.displayInFormation();

        Offer o4 = new Offer();

        o4.displayInFormation();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);
        System.out.println("myOffers = " + myOffers);


        System.out.println("===========================================");

        for (Offer  each:myOffers ) {
            each.displayInFormation();
            
        }


        System.out.println("===========================================");


        for (int x = 0; x <myOffers.size() ; x++) {

            Offer each = myOffers.get(x);
            each.displayInFormation();


        }








        
    }
}
