package day32;

public class numbersComparision {

 public static void main (String[] args){


     skipCountBy3From0to50();
 }


 public static void  numberComparision (int num1, int num2){

     /**
      * Create static void methods as below
      *
      * numberComparision
      * this method has 2 parameters called num1 and num2
      * if num1 is more than num2 print num1 is more than num2
      * if num2 is more than num1 print num2 is more than num1
      * if num2 are equals num1 print they are equal
      */

     if (num1>num2){
         System.out.println(num1);
     }else if (num2>num1){
         System.out.println(num2);
     }else if(num1==num2){
         System.out.println("They are equal");
     }
 }


 public static void stringRepeater(String strToRepeat, int count){
/**
     * String repeater
     * this method has 2 parameters
             *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
             */

     for (int x = 0; x <count ; x++) {
         System.out.println(strToRepeat);

     }


 }

    public static void skipCountBy3From0to50(){
/** skipCountBy3From0to50
                *
     * * create a method that has no parameter
                * and skip count by 3 from 0 to 50
                **/
        for (int i = 0; i <50 ; i+=3) {
                System.out.print(i+" ");
            }
        }





    public static void  countDownByEvenNumberFrom50to0(){
     /**

     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     **/



        for (int x = 50; x >0 ; x--) {
            if (x%2!=0){
                System.out.println(x);
            }

        }
    }





    public static void print1toX(int x) {

        /**
         * print1toX
         * * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.
         *
         *
         */


        for (int i = 1; i <x ; i++) {
            System.out.print(i+" ");

        }

    }
}
