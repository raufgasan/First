package repl;

import java.util.ArrayList;

public class Repl_216_MethodsWithArrayList17_BlogPostdb {
    public static void main(String[] args) {

//        This task is optional, since we did not practice ArrayLists in this way.
//
//                blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database, each row from the database table is represented by a position in the ArrayList. each ArrayList position holds a string array that holds the row data.
//        the database table columns are : id(string),title(string), content(string).
//
//                ArrayList<String[]> r example:
//        Each item in ArrayList is a String Array
//
//        r = [
//["1","title","content1"],
//["2","another title","content2"],
//["3","yet another title","content3"]
//]
//
//        the String id argument of blogDb method is referring to a row from the table the arraylist holds.
//        You need to loop through each element in the ArrayList and find the matching String[] with that id.
//        Then return the title and content in the format below.
//
//        for example
//
//        blogDb(r,"1")
//        returns:
//        title
//                content1
//
//        blogDb(r,"2")
//        returns:
//        another title
//        content2
//
//        when you return the string make sure there is a line break between the title and content.
//        you can use " \n " to line break in a string


//        Main m = new Main();
//        ArrayList<String[]>  arr = new ArrayList<String[]>();
//        arr.add(new String[]{"1","title 1","content"});
//        arr.add(new String[]{"2","title 2","content"});
//        arr.add(new String[]{"3","title 3","content3"});
//
//        String post = m.blogDb(arr,"3");
//        System.out.print(post);
//        //should output:
//        //title 3
//        //content3
    }


    public String blogDb(ArrayList<String[]> r,String id) {
        String ret = "";
        for (int x = 0; x <r.size() ; x++) {
            for (int z = 0; z <r.get(x).length ; z++) {
                if(r.get(x)[z].equals(id)){
                    ret= r.get(x)[1]+"\n"+r.get(x)[2];
                }

            }

        }
return ret;

    }
}

