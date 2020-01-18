package day40;

import java.util.ArrayList;

public class HotMarketActions2 {
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


        o3.salary=o3.salary+2000;
        //o3.salary+=2000;
        System.out.println("o3 new salary = " + o3.salary);

       o4.salary=o4.salary+o3.salary+o2.salary+o1.salary;
       o4.displayInFormation();

       o4.turnToFullTime();
       o4.displayInFormation();

        o4.turnToFullTime();
        o4.displayInFormation();

        o4.changeLocation("DC");
        o4.displayInFormation();




        o1.chageAllInfo("Amazon","Virginia",150000,true);
     //   o1.displayInFormation();


        for (int i = 0; i <=200 ; i++) {
            System.out.println("YES");
        }

        boolean result =o1.isHundredKOffer();
        if (result==true){
            o1.changeLocation("Atlanta");
        }



        
    }
}
