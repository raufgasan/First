package day48.InterfsceEx;

import day48.InterfsceEx.Flyable;
import day48.InterfsceEx.Plane;

public class Sumerman implements Flyable {

    public void fly() {
        System.out.println("Fly with super paver");
    }


    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();

        System.out.println(Flyable.HAVE_WING );
    }


}