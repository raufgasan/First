package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x = 10;

        Integer xObj1 = new Integer(12);
        Integer xObj2= Integer.valueOf(12);
        Integer xObj3= Integer.valueOf("5");

        byte bValue = xObj2.byteValue();


        double dValue = xObj2.doubleValue();
        System.out.println(dValue);





        }
    }
