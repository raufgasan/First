package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {


        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(true,false));
        System.out.println(monkeyTrouble(false,false));

    }


    /**
     *
     * @param aSmaile
     * @param bSmile
     * @return
     */

    public static boolean monkeyTrouble(boolean aSmaile, boolean bSmile){


        if ((aSmaile && bSmile) || (!aSmaile && !bSmile)){
            return true;
        } else {
            return false;
        }


//         return aSmaile==bSmile;
    }

    /**
     *
     * @param aSmaile
     * @param bSmile
     * @return
     */

    public static String monkeyTrouble2(boolean aSmaile, boolean bSmile){


        if ((aSmaile && bSmile) || (!aSmaile && !bSmile)){
            return "yes";
        } else {
            return "no";
        }



    }
}
