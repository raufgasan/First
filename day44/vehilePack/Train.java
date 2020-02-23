package day44.vehilePack;

// what is inherited from Super class

// fields and methods that visible to the sub class are inherited
// constructors are not inherited

public class Train extends Vehicle {

    //    String make;
//    int year ; i
    int wagonCount;


    public void makeChoChoSound() {
        System.out.println("CHOOOO CHOOOO ");
    }


}
