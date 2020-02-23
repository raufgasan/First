package day44.vehilePack;

public class Vehicle {


    // protected access modifier :
    // make the member accessible in subclasses of this class
    // in different package
    protected String make;

    private int year;


    public void start() {
        System.out.println("starting " + make);
    }

    public void goForward() {
        System.out.println(year + " is going forward");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
