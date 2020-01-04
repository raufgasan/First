package repl;

import java.util.Scanner;

public class Repl_123_UtopianTree {
    public static void main(String[] args) {

        int size=0;
        for (int x = 1; x <=10 ; x++) {
            if(x<4) {
               size+=1;
                System.out.println("year " + x + " - growth " + 1 + " cm");
                System.out.println("tree size: "+size+"cm");
            }else{
                size+=2;
                System.out.println("year " + x + " - growth " + 2 + " cm");
                System.out.println("tree size: "+size+"cm");}
        }

    }
}