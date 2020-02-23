package task.muhtar1_22_20;

public class Toyota extends Car {

    public void start(){
        System.out.println("Push Button and start");
    }









    public static void main(String[] args) {


        Toyota car1 =new Toyota();
        car1.start();

        Car car2 = new Car();
        car2.start();

        Jeep car3 = new Jeep();
        car3.start();


    }


}
