package task.ArrayList1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1_17 {
    public static void main(String[] args) {
//        Given a ArrayList of 6 Integer 1,3,7,2,12,7
//        insert 100 in between each numbers
//        For example :
//        1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
//
//        Optionally make it a method
//        write a static void method that accept a ArrayList of integer object and insert 100 in between items.

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(3);
        num.add(7);
        num.add(2);
        num.add(12);
        num.add(7);
        num.add(8);

        for (int i = 1; i <num.size() ; i+=2) {
            num.add(i,100);
            
        }
        System.out.println("num = " + num);

//        Given List of names with various character count,
//        Remove any name with less than 2 characters
//        and if any name has more than 10 character only keep 10 characters
//        and if it has exactly 5 characters , reverse it
//        Of course , Otionally make a method out of it.


        ArrayList<String> names = new ArrayList<>();

        names.add("Stephen");
        names.add("Michael");
        names.add("Z");
        names.add("J");
        names.add("Tiffany");
        names.add("G");
        names.add("Som");
        names.add("z");
       

        names.removeIf(name -> name.length() < 3);
        System.out.println(names);

        for (String name : names) {
            if (name.length()>11){
                name=name.substring(0,11);
            }
        }

        for (String name : names) {
            String nameRev="";
            if (name.length()==5){
                for (int i = name.length()-1; i >=0 ; i--) {
                    nameRev+=name.charAt(i);
                    name=nameRev;

                }
            }

        }
        }



//    Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
//            * print pass if its more than 60 fail if not
//* count how many score are more than 90
//            * get the average score
//* update the values with score-grade pair
//  for example
//79C , 54F, 100A, 65D, 44F , 89B , 95A
//    Optionally create 4 methods according to above criteria


    






    //        Create a method that accept String object and return List<Character> that contains each character.
    public static List<Character> charSplit (String nam ){

        ArrayList<Character> namArr = new ArrayList<>();
        for (int i = 0; i <nam.length() ; i++) {
            namArr.add(nam.charAt(i));
        }
       return namArr;
    }


}
