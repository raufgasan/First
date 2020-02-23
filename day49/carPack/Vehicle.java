package day49.carPack;

public abstract class Vehicle {

    int year;
    public Vehicle(){}

    public Vehicle(int year){this.year=year;}

    public abstract void start();

    public void goForward(){
        System.out.println("Vechicle go forward");
    }




}
