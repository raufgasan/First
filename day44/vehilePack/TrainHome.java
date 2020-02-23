package day44.vehilePack;

public class TrainHome {
    public static void main(String[] args) {


        Train t1 = new Train();
        t1.makeChoChoSound();
        // these attributes we got from Vehicle
        t1.make = "Thomas";
        //t1.year = 1999; private is not inherited
        t1.setYear(1999);
        System.out.println(t1.getYear());
        // calling the method we got from Vehicle
        t1.start();
        t1.goForward();

    }
}
