package day50.officeHour;

public abstract class Car {

    public abstract void start();

}

class Toyota extends Car{

    @Override
    public void start(){
        System.out.println("Push Button");
        System.out.println("Start Engine");
    }

}

class Jeep extends Car{

    @Override
    public void start(){
        System.out.println("Call mechanic ");
        System.out.println("Oil change");
        System.out.println("Start engine");
    }

}

class Test {
    public static void main(String[] args) {
        Jeep j1 = new Jeep();
        j1.start();
    }
}