package day32;

public class MethodWithReturnIntro {
    public static void main (String[] args){

    String name = giveMeMyName();

        System.out.println("name = " + name);

        
        int myResult =dubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        System.out.println("myResult 100 = " + dubleTheNumber(100));
        System.out.println(dubleTheNumber(15));
        int addXtoYresolt = addTwoNumbers(14,16);
        System.out.println("addXtoYresolt = " + addXtoYresolt);

        System.out.println(addTwoNumbers(14,16));
        
    }


    public static int dubleTheNumber (int num){

        System.out.println("I am going to double the value of "+num);
        int result = num*2;
        return result;
    } 



    public static String giveMeMyName(){
        
        return "Rauf";
        
        
    }


    public static int addTwoNumbers(int num1, int num2){
        return num1+num2;



    }
}
