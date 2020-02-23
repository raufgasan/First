package day52.warmup;

public class Banktest {

    public static void main(String[] args) {


        Account a1= new Account("Hasan", 100);
        Account a2 = new Account("Israfil",200);

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        a1.transferAll(a2);


        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        a2.transferAll(a1);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

    }
}
