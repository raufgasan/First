package day60;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {


        // this the ArrayList constructor that accept any type of Collection object
        // public ArrayList(Collection<E> c) { }

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        // what is the best way to remove element while iterating over the collections
        // using the Iterator instead of for each loop / for loop / .....

        // iterating over a collection object using iterator
        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()) {

//            System.out.println("myIter.next() = " + myIter.next());
            if (myIter.next() <= 10) {
                myIter.remove();
            }

        }
        System.out.println("nums = " + nums);
//        // hasNext() -->> check whether you have next item
//        System.out.println("myIter.hasNext() = " + myIter.hasNext() );
//        // next() -->> will move the pointer of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        // removing whatever is the iterator is pointing to at this location
//        myIter.remove();
//
//        System.out.println("myIter.next() = " + myIter.next() );
//
//        System.out.println("myIter.hasNext() = " + myIter.hasNext() );




    }

}
//    Common data processing in real life
//
//
//Scenario 1 :
//        If I ask you tell me your state so I can store :
//        first I did not care about duplicates
//        I would just created a List and keep adding all your state into it
//
//
//        Scenario 2 :
//        then I realize there are many studenst from same states
//        and I want to only store the unique states you are from
//
//        so I need some kind of data structure already does it for me
//        so I dont have to use bunch of if statememts to handle it
//
//        Set interface is a data structure for unique element
//
//        if I wanted to keep the sorted order
//        SortedSet
//
//
//
//        Scenario 3 :
//        now I want to actually store the student-state pair
//        so i can get the state by student name :
//        Michael : Virginia
//
//        Map interface
//	if I wanted to keep the sorted order
//            SortedMap
//
//
//            Scenario 4 :
//            I want to answer the questions I got from the students
//            but I want to answer them in the order I received
//            so First come first serve based !!
//
//            Queue
//
