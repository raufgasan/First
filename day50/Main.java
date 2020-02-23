package day50;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        
        Addition q1 = new Addition(10, 5);
        System.out.println("q1 : " + q1);
        q1.calculate();
        System.out.println("q1 : " + q1);

        Substraction q2 = new Substraction(5, 10);
        System.out.println("q2 : " + q2);
        q2.calculate();
        System.out.println("q2 : " + q2);


        Multiplication q4 = new Multiplication(10, 3);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 = " + q4);


        Devision q5 = new Devision(5, 3);
        System.out.println("q5 = " + q5);
        q5.calculate();
        System.out.println("q5 = " + q5);



        List<Question> allTestQuestions = Arrays.asList(q1, q2, q4, q5);
        for (Question eachQ : allTestQuestions) {

            System.out.println("eachQ = " + eachQ);

        }
        
    }
}
