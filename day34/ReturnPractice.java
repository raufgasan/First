package day34;

public class ReturnPractice {
    public static void main (String[] args){

        prontName("Jon");
        prontName("Rauf");

    }


    public static void prontName(String name){

        if(name.length()<4){
            System.out.println("invalid name!!!");
            return;
        }

        System.out.println(name);

        }
    }

