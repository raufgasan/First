package day41;

import day40.BankAccount;

public class AccessModifierInto {

    public static void main(String[] args) {


        BankAccount b1 = new BankAccount();
        b1.showAccountBalance();



        Person p1 = new Person();

        p1.setAll("Hasan",34,123456789);
        System.out.println(p1);

        System.out.println(p1.getName());
        p1.setName("Emma");
        System.out.println(p1.getName());


        System.out.println(p1.getAge());
        p1.setAge(30);
        System.out.println(p1.getAge());


        System.out.println(p1.getSsn());
        p1.setSsn(987654321);
        System.out.println(p1.getSsn());




    }


}
