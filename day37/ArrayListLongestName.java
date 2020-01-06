package day37;

import java.util.ArrayList;

public class ArrayListLongestName {
    public static void main(String[] args) {



        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Zibahiddin");

        System.out.println("Name List = " + nameLst);



//        find longest name in the list
        String longestName = nameLst.get(0);

        for (int i = 0; i <nameLst.size() ; i++) {
            if (longestName.length()<nameLst.get(i).length()){
                longestName=nameLst.get(i);

            }
            
        }

        System.out.println("\n\tlongestName = " + longestName);



        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word , and get the character count
        // then loop through each names
        // and check whether character count equal to longest word character count
        for (int i = 0; i < nameLst.size(); i++) {

            if (nameLst.get(i).length() == longestName.length()) {
                System.out.println("Longest words = " + nameLst.get(i));
            }

        }



        //        find last longest name in the list
        String longestLastName = nameLst.get(0);

        for (int i = 0; i <nameLst.size() ; i++) {
            if (longestName.length()<=nameLst.get(i).length()){
                longestName=nameLst.get(i);

            }

        }
        System.out.println("\n\tlongestLastName = " + longestLastName);

//        length VS length() VS size()
//        length     :  counting the elements inside array, it is a property of array object
//                      last item of an array : arr[arr.length-1];
//        length()  :  counting the characters inside String , it's a method of String object
//                     last char of a String : str.charAt( str.length()-1 );
//        size()    :  counting the elements inside ArrayList object
//                      last element of an arrayList : lst.get( lst.size()-1);








    }
}
