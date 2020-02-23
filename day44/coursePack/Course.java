package day44.coursePack;

public class Course {
    String name;
    String type;
    // there is only one value for this counter shared by all the objects

    // each object will have their own name and type



    int countInt=0;


    static int counterStatic;


public Course(){}


    public Course(String name, String type) {
        this.name = name;
        this.type = type;



        counterStatic++;
        countInt++;


    }



    public void test(int countInt){
        this.countInt=countInt;
    }



    @Override
    public String toString() {
        return ""+ counterStatic+"||" +countInt;
    }
}
