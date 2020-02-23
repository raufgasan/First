package day46.bankPack;

public class SavingAccount extends BankAccount{


    //    String accountHolder;
//    long accountNum;
//    double balance;
    double interestRate;


    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {

        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;

    }



    // in our SavingAccount , if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement
    @Override
    public void withdraw(int amount) {
        //        balance -= amount;
//        balance -= 30; // this is the penalty
        super.withdraw(amount);
        super.withdraw(30);
        // or super.withdraw(amount+30);

    }
    @Override
    public void deposit(int amount) {

        //balance += amount + amount*interestRate;
        // calculating the interest rate and casting to int variable
        // because deposit method accept int data type not double !!!!
        int actualAmount = (int) (amount + amount * interestRate);
        super.deposit(actualAmount);

    }

    @Override // its optional , once being used , it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
