package day31;

public class MethodPractice4 {

// Create a class called MethodPractice4
// no need for object when being called                : static
// it should be accessible anywhere in your project    : public
// it does not return any value                        : void
// does not need any external data when being called   : (nothing inside)
// Create a method called countDownFrom20tillOne
// Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
// Create a method to spell your name :  Seda -->> S-e-d-a



    public static void countDownFrom20tillOne(){
        for (int i = 20; i >=1 ; i--) {
            System.out.print("i-->"+i);

        }
    }

    public static void printOddNumbers1to100(){

        for (int x = 0; x <100 ; x++) {
            if (x%2==1)
            System.out.print("x"+x);

        }
    }

    public static void spelName(){

        String name = "Rauf";
        for (int x = 0; x <name.length() ; x++) {
            System.out.println();

        }

    }


    public static void main(String[] args){
        spelName();
        System.out.println("");
        countDownFrom20tillOne();
        System.out.println("");
        printOddNumbers1to100();
    }
}
