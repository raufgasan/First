package day34;

public class TreeDigitNumber {

    public static void main(String[] args) {


        int result1=build3DDigitNumber(6,4,0);
        System.out.println(result1);

        int result2=build3DDigitNumber(6,14,0);
        System.out.println(result2);

        int result3=build3DDigitNumber(16,14,10);
        System.out.println(result3);

        System.out.println(result1+result2);
    }


    public static int build3DDigitNumber(int difit1, int difit2,int difit3){

        if (difit1<0||difit1>9){
            difit1=0;

        }
        if (difit2<0||difit2>9){
            difit2=0;

        }

        if (difit3<0||difit3>9){
            difit3=0;

        }

        int number = (difit1*100)+(difit2*10)+difit3;
        return number;


    }

}
