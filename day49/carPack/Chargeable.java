package day49.carPack;

public interface Chargeable {

    public default void charge(){
        System.out.println("Default charge ");
    }
}
