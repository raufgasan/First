package day32;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {

        System.out.println(divide(10,3));
        System.out.println(divide(0,3));
        System.out.println(divide(10,0));
    }

    public static double divide (double num1, double num2){


        return num1/num2;
    }
}
