package day34;

public class MethodOverloadingIntro {
    public static void main(String[] args){

        System.out.println("Method overloading");
        System.out.println(12);

        String name = "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf('o',2));



        sayHello();
        sayHello("word");
        sayHello(100);
        System.out.println(sayHello("muge","orman"));

    }
            public static void sayHello(){
                     System.out.println("hello");
}
    public static void sayHello(String name) {
        System.out.println("hello"+name);


    }

    public static void sayHello(int num) {
        System.out.println("hello"+num);


    }

    public static String sayHello(String firstName, String lastName){


        return "hello"+firstName+" " +lastName;
    }


}
