package day46.bankPack;

public class Bank {
    // BAD IDEA TO HAVE MAIN HERE , JUST DOING IT ANYWAY
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Mohammed", 12345, 50000, 4.2);
        System.out.println("s1 = " + s1.toString());

        s1.withdraw(10000);
        System.out.println("s1 = " + s1);




        CheckingAccount acc1 =
                new CheckingAccount("Zehra", 54321, 10000);
        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5300);
        System.out.println("acc1 = " + acc1);
    }
}
