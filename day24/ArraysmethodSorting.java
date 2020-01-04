package day24;

import java.util.Arrays;

public class ArraysmethodSorting {
    public static void main(String[] args) {

        int [] scores = {99,44,66,23,19,55};


        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));


        System.out.println("first item value : " + scores[0]);

        System.out.println("================================");

            char[] nameChars = {'G','A', 'D', 'Z', 'C', 'A' };

        System.out.println(Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));

        System.out.println("================================");

        char[] nameChars2 = {'G',' ', 'd', '@', '1', 'A' };

        System.out.println(Arrays.toString(nameChars2));
        Arrays.sort(nameChars2);
        System.out.println(Arrays.toString(nameChars2));




        System.out.println("================================");

        String [] name = {"name1","nAME2","rAuF@"};

        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));



        System.out.println("================================");
        String [] name2 = {"124","123","134"};

        System.out.println(Arrays.toString(name2));
        Arrays.sort(name2);
        System.out.println(Arrays.toString(name2));


        System.out.println("================================");

        String [] name3 = {"azb","abc","a@c"};

        System.out.println(Arrays.toString(name3));
        Arrays.sort(name3);
        System.out.println(Arrays.toString(name3));

    }


}
