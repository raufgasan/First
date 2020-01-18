package justFun;

public class LeetCode {
    public static void main(String[] args) {

        System.out.println(arrayCount9(""));
    }

    public static String  arrayCount9(String  str) {


        String strN="";
        for (int i = 0; i <str.length()-1 ; i++) {
            strN=strN+str.charAt(i)+str.charAt(i+1);
            i=i+3;
        }

        return strN;


    }

}