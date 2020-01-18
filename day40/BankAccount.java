package day40;

public class BankAccount {


    String aType;
    String aHolder;
    long aNumber;
    double balance;


    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance ){
        aType=newAccountType;
        aHolder=newAccountHolder;
        aNumber=newAccountNumber;
        balance=newBalance;
    }




    //showAccountBalance
    public void showAccountBalance(){
        System.out.println("current balance="+balance);
    }




    //showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println("aType = " + aType);
    }

    //getBalance return the balance
    public double getBalance(){
        return balance;
    }

    //deposit(amount)

    public void deposit(double amount){
        balance=balance+amount;
    }
    //withdraw (amount,account)
public void withdraw(double amount){
        balance=balance-amount;
}
    //withdraw100Cash
public void withdraw100Cash(){
      withdraw(100);
}

    //purchaseProduct(productPrice, count )

private void purchaseProduct(double productPrice, int count ){

        
}



}


