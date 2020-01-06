package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayList {
    public static void main(String[] args) {


        List<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Zibahiddin");

        printAList(nameLst);
    }

//       Create a method that accept a List of String as argument
//      same thing as a method that has List of String parameter
//       and print out each and every item in the list vertically
//       return nothing

    /**
     *
     * @param lst
     */
        public static void printAList( List<String> lst ){
            for (String each : lst) {
                System.out.println("each = " + each);
            }
        }

    }

