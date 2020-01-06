package day37;

import java.util.ArrayList;
import java.util.List;

public class ListWithLoop {
    public static void main(String[] args) {
        
//        create an ArrayList of Integer and fill it up with 1-100
        
        
        
        List<Integer> num = new ArrayList<>();


        for (int x = 0; x <=100 ; x++) {
            num.add(x);            
        }

        System.out.println("\n\tnum = " + num);
        
//        change all the odd number value to 0 


        for (int i = 0; i <num.size() ; i++) {
            if (num.get(i)%2==1){
                num.set(i,0);
            }
            
        }
        System.out.println("\n\tList odd changed to 0 = " + num);
        System.out.println("Print only odd number  = ");
        for (int i = 0; i <num.size() ; i++) {

            if (num.get(i)>1){
                System.out.print(num.indexOf(i)+"="+i+", ");
            }

        }

//        insert 100 to first index

//        num.set(0,num.get(0)+100);
        num.add(0,100);
        System.out.println("\n\tnum 1 = " + num.get(0));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("\n\tlst2 = " + lst2);
// insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("\n\tlst2 = " + lst2);


//      add five 100 in front of 44

        for (int i = 0; i <5 ; i++) {

            lst2.add(lst2.indexOf(44),100);

        }
        System.out.println("lst2 after adding five 100 before 44 = " + lst2);
    }
}
