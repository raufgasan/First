package day45.electronicPack;

public class Electronic {

    static boolean useElectricity = true;
    String brand;

    public static void displayUseElectricity() {
        System.out.println("displaying useElectricity  " + useElectricity);
    }

    public void showBrand() {
        System.out.println("brand = " + brand);
    }
}
