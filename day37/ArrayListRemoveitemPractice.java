package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveitemPractice {
    public static void main(String[] args) {


        List<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        lst2.add(2);


        System.out.println("lst2 = " + lst2);

        lst2.remove(3);
        System.out.println("lst after removing index 3 item= " + lst2);

        lst2.remove(2);
        System.out.println("lst after removing index 2 item= " + lst2);


//        lst2.remove(new Integer(2));
        lst2.remove(Integer.valueOf(2));

        System.out.println("lst2 = " + lst2);


    }
}
