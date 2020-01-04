package day31;

public class MethodClass {

    public static void sayHello(){

        // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");


    }
    public static void main (String[] args) {

        MethodClass.sayHello();
        sayHello();

        for (int i = 0; i <10 ; i++) {
            System.out.print("\n"+(i+1)+"-->");
            countFrom1to10();
        }

    }




    public static void countFrom1to10() {

        for (int x = 0; x <= 10; x++) {
            System.out.print(x);
        }

    }




}