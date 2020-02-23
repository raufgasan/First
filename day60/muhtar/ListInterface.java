package day60.muhtar;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

//        List(I):  implemented By ArrayList(C), LinkedList(C), Vector(C)
//        has index numbers, dynamic sized, accepts duplicates


        //    List<Integer> list1 = new List<Integer>()       can not be created because List is not class

        List<Integer> list2 = new ArrayList<>();     //   ArrayList: array based class, internally uses the array
        List<String> list3 = new LinkedList<>();    //LinkedList:  each objects are doublly linked in the LinkedList
                                                    //  doublly linked:  adding & removing  (add(), remove()) data are faster
                                                    //  			Advantage: remove and add faster than ArrayList
                                                     //   disAdvantage: retriving data (get() ) is slower

        List<Double> list4 = new Vector<>();        //  is synchronized, only prefered in  multi-threads

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(60,50,40));
                list5.add(10);
                list5.add(20);
                list5.add(30);
                list5.remove(1);

        System.out.println(list5);

        LinkedList<Integer> list6 = new LinkedList<>();
        list6.add(10);
        list6.add(20);
        list6.add(30);
        list6.remove(1);
        System.out.println(list6);


        Vector<Integer> list7 = new Vector<>();

        Stack<Integer> st = new Stack<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(5);

        System.out.println(st.pop());
        System.out.println(st);











    }
}
