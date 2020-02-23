package task.pet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetStore {
    public static void main(String[] args) {


//        Create another class called PetStore with main method


        Pets p1 = new Pets("cat", "myu myu");

        Pets p2 = new Pets("dog","charly");
        Pets p3 = new Pets("horse","AhalTeke");
        Pets p4 = new Pets("fish","glory");
        Pets p5 = new Pets("cat","joly");
        Pets p6 = new Pets("dog","fill");
        Pets p7 = new Pets("bird","kesha");
        Pets p8 = new Pets("horse", "TM");

    //    ArrayList newList= new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));
        List<Pets> listP=Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
        System.out.println("newList = " + listP);

//        for (Pets each:newList ) {

        for (int i = 0; i <listP.size() ; i++) {

            System.out.println(listP.get(i).getName());


        }

        for (Pets each: listP  ) {

            if (each.getType().equals("cat")){
                System.out.println(each);
            }
        }


        



//                Create 8 Pet objects with initial value
//        Store them into a List<Pet>
//        1, print out all info
//        2, print out only name
//        3, print out only cats
    }
}
