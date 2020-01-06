package repl;

public class Repl_188_MethodOverloading1 {
    public static void main(String[] args) {

//        In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
//        First method should work with array of integers (int[]) and return int, and second method should
//        work with an array of doubles (double[]) and return double as a result.
//        Methods must have the same name and different parameters.
//                Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
//
//        Comment: Methods should be non static and with a return type.


    }


    public static int findMax(int[] a){
        int max = 0;
        for (int i = 0; i <a.length ; i++) {
            if (max < a[i]) {
                max=a[i];
            }

        }
        return max;

    }

    public static double findMax(double[] b){
        double max = 0;
        for (int i = 0; i <b.length ; i++) {
            if (max < b[i]) {
                max=b[i];
            }

        }
        return max;


    }
}
