package day24;

public class ForEachLoopPractis {
    public static void main(String[] args) {

//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices
//        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
//        assume that the order of grocery Items match the prices in same order.


//        String [] groceryItems = new String[6];
//        String [] groceryItems = new String[6] {"apple","banana","grape","strawberry","blueberry","kiwi"};
        String [] groceryItems =  {"apple","banana","grape","strawberry","blueberry","kiwi"};


//        1, loop through each grocery items and print them in one line

            for(String items: groceryItems){



                String lastIteam= groceryItems[groceryItems.length-1];
                System.out.print(items );
                if (!items.equals(lastIteam)) {

                    System.out.print("----->");

                }


            }








    }
}
