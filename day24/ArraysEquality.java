package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int []num1 ={2,5,6,7,3,34,6};
        int []num2 ={22,45,6,37,3,6,9};
        int []num3={2,5,6,7,3,34,6};
        int []num4={34,5,7,6,3,2,6};

        System.out.println(num1==num2);
        System.out.println(num1==num3);
        num1.equals(num2);
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num1));

        boolean num1_2 = Arrays.equals(num1,num2);

        System.out.println(num1_2);

        boolean num1_3 = Arrays.equals(num1,num3);
        System.out.println(num1_3);


        boolean num3_4 = Arrays.equals(num4,num3);
        System.out.println(num3_4);


        Arrays.sort(num3);
        Arrays.sort(num4);
        boolean num3_41 = Arrays.equals(num4,num3);
        System.out.println(num3_41);

    }
}
