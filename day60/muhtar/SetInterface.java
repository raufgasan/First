package day60.muhtar;
import com.sun.source.tree.Tree;

import java.util.*;
public class SetInterface {

    public static void main(String[] args) {

        List<Integer>list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(100,100,100));
        System.out.println(list1);//[100,100,100]
        Set<Integer> st1 = new HashSet<>();
                st1.add(100);
                st1.add(100);
                st1.add(100);
        System.out.println(st1);//[100]
//        System.out.println(st1.get()); set dose not have index order


        Set<Integer> hashset = new HashSet<>();

        hashset.add(100);
        hashset.add(50);
        hashset.add(30);
        hashset.add(10);
        hashset.add(20);
        System.out.println(hashset);//[50, 100, 20, 10, 30] dose not keep order





        Set<Integer> linkedshset = new LinkedHashSet<>();
        linkedshset.add(100);
        linkedshset.add(50);
        linkedshset.add(30);
        linkedshset.add(10);
        linkedshset.add(20);
        System.out.println(linkedshset);//[100, 50, 30, 10, 20] keep order as it is
                                        // double-linked: faster than HashSet






        Set<String> st3 = new TreeSet<>();
            st3.add("z");
            st3.add("y");
            st3.add("x");
            st3.add("w");
        System.out.println(st3);//[w, x, y, z]


        // task: remove duplicate and sort

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,5,7,15,10,10,10));
        Collections.sort(list);
        System.out.println(list);//[5, 7, 9, 10, 10, 10, 10, 15]
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,9,5,7,15,10,10,10));
        TreeSet<Integer> ts = new TreeSet<>(list2);
        System.out.println(ts);//[5, 7, 9, 10, 15]



        String str = "AAAAAABBBBBBCCCCZZZZZWWWWWFFFF";
        String [] arr = str.split("");
        System.out.println(Arrays.asList(arr));//[A, A, A, A, A, A, B, B, B, B, B, B, C, C, C, C, Z, Z, Z, Z, Z, W, W, W, W, W, F, F, F, F]
        TreeSet<String> rest = new TreeSet<>(Arrays.asList(arr));
        String res = rest.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(res);//ABCFWZ

        HashSet<String> rest2 = new HashSet<>(Arrays.asList(arr));
        String res2 = rest2.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(res2);//ABCFWZ

        LinkedHashSet<String> rest3 = new LinkedHashSet<>(Arrays.asList(arr));
        String res3 = rest3.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(res3);//ABCZWF



        String strShort=new LinkedHashSet<String>(Arrays.asList(arr)).toString();
        System.out.println(strShort);//[A, B, C, Z, W, F]





    }
}
