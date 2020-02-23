package udumi;

public class Human {

    String name;
    int age;
    String eyeColor;
    int heightInInces;

    public Human(String name, int age, String eyeColor, int heightInInces) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.heightInInces = heightInInces;
    }

    public Human(){}

    public void speak(){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My eye color is "+eyeColor);
        System.out.println("My height is "+ heightInInces);
    }



    public void eat(){
        System.out.println("I am eating");
    }


    public void work(){
        System.out.println("I am working");
    }



    public void sleep(){
        System.out.println("I am sleeping");
    }

}
