package repl;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Repl_086_Party {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        System.out.println("Please enter guest name:");
        String guestName =input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String       answer = input.nextLine();

        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String name =input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            String  answer2 = input.nextLine();
            guestName = guestName+ ", "+name;
        }
        System.out.println("Guest's list: "+ guestName);



    }
}





