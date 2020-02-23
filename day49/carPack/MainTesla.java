package day49.carPack;

public class MainTesla {

    public static void main(String[] args) {



        Tesla t1 = new Tesla(2020, 460, "rauf");
        t1.start();
        t1.selfDrive();
        t1.charge();
        t1.goForward();

        System.out.println(t1);


    }

}
