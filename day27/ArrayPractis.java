package day27;

public class ArrayPractis {
    public static void main(String[] args) {


        int scores[]= {4,5,6,7,8,9,1,2,3,4,5};

        int min= scores[0];
        for (int x = 0; x <scores.length ; x++) {

            if (min>scores[x]){
                min = scores[x];
            }
                               }
        System.out.println(min);

    }
}
