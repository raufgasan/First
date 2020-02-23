package day49.drawablePack;

public class Main {

    public static void main(String[] args) {


        Square s1 = new Square("my precious", 10);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation = " + s1);
        s1.draw();

        Circle c2= new Circle("my Circle", 10);
        System.out.println("c2 without area calculation = " + c2);
        c2.calculateArea();
        System.out.println("c2 with area calculation = " + c2);
        c2.draw();

    }
}
