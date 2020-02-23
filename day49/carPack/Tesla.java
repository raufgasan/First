package day49.carPack;

import day49.carPack.Autonomous;
import day49.carPack.Chargeable;
import day49.carPack.Vehicle;

public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void selfDrive() {
        System.out.println("tesla self driving");
    }

    @Override
    public void start() {
        System.out.println("bla bla");

    }


    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
