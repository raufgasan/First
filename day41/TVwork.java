package day41;

public class TVwork {
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.name="Sony";
        System.out.println("t1.toString() = " + t1.toString());
        t1.turnOn();
        t1.setcurrentChannel(12);
        t1.setcurrentChannel(121);


        System.out.println(t1.getcurrentChannel());
        t1.turnOff();

        System.out.println("t1="+t1.toString());
    }
}
