package repl;
import java.util.Scanner;

public class Repl_157_Methods12_TimeConversion {

//    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
//    Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//    Function Description
//    It should print a new string representing the input time in 24 hour format.
//    timeConversion has the following parameter(s):
//    s: a string representing time in  12 hour format
//
//    Input: 07:05:45PM
//    Output: 19:05:45

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.equals("12:00:00AM")){
            System.out.println("00:00:00");
        }
        if (s.equals("12:00:00PM")){
            System.out.println("12:00:00");
        }

        String [] arr = s.split(":");

        if (arr[2].contains("PM")){
           int first = Integer.parseInt(arr[0])+12 ;
           arr[0]=String.valueOf(first);
        }

      String time = arr[0]+arr[1]+arr[2].substring(0,2);

        System.out.println(time);





    }
}






