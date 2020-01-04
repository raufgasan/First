package repl;

import java.util.Scanner;
import java.util.SortedMap;

public class Repl_090_TipCalculator {
    public static void main(String[] args) {


//        Write your code inside the method.
//        Use the values given as method parameters.
//                Assign final values.
//        Then user should select service quality that will correspond to tip percent.
//        Poor = 5%
//                Fair = 10%
//                Good = 15%
//                Great = 20%
//                Excellent = 25%
//                The program should display the following information based on the user input:
//        Split or No split
//        Number of people entered: &&&&
//        Service Quality:
//        Total to pay:
//        Total tip:
//        Total per person:
//        Tip per person:
//        https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

//        Input:
//        Split:Yes
//        Number of people:4
//        Check amount:476.0
//        Service Quality:Excellent
//
//        Output:
//
//        Number of people entered: &&&&
//        Total to pay: 595.0
//        Total tip: 119.0
//        Total per person: 148.75
//        Tip per person: 29.75
//

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.nextLine();

        if (split.equalsIgnoreCase("yes")) {

            System.out.println("Number of people:");
            int numberPeople = scan.nextInt();


            System.out.println("Check amount:");
            double checkAmount = scan.nextDouble();

            System.out.println("Service Quality:");
            String service = scan.next();


            String count = "";

            while (0 < numberPeople) {

                count = "&" + count;
                numberPeople--;
            }


            System.out.println("Number of people entered: " + count);
            System.out.println();
            if (service.equalsIgnoreCase("Poor")) {
                double serviceCv = checkAmount / 100 * 5;
                System.out.println("Total to pay: " + (checkAmount + serviceCv));
                System.out.println("Total tip: " + serviceCv);
                System.out.println("Total per person: " + ((checkAmount + serviceCv) / count.length()));
                System.out.println("Tip per person: " + (serviceCv / count.length()));

            } else if (service.equalsIgnoreCase("Fair")) {
                double serviceCv = checkAmount / 100 * 10;
                System.out.println("Total to pay: " + (checkAmount + serviceCv));
                System.out.println("Total tip: " + serviceCv);
                System.out.println("Total per person: " + ((checkAmount + serviceCv) / count.length()));
                System.out.println("Tip per person: " + (serviceCv / count.length()));

            } else if (service.equalsIgnoreCase("Good")) {
                double serviceCv = checkAmount / 100 * 15;
                System.out.println("Total to pay: " + (checkAmount + serviceCv));
                System.out.println("Total tip: " + serviceCv);
                System.out.println("Total per person: " + ((checkAmount + serviceCv) / count.length()));
                System.out.println("Tip per person: " + (serviceCv / count.length()));

            } else if (service.equalsIgnoreCase("Great")) {
                double serviceCv = checkAmount / 100 * 20;
                System.out.println("Total to pay: " + (checkAmount + serviceCv));
                System.out.println("Total tip: " + serviceCv);
                System.out.println("Total per person: " + ((checkAmount + serviceCv) / count.length()));
                System.out.println("Tip per person: " + (serviceCv / count.length()));

            } else if (service.equalsIgnoreCase("Excellent")) {
                double serviceCv = checkAmount / 100 * 25;
                System.out.println("Total to pay: " + (checkAmount + serviceCv));
                System.out.println("Total tip: " + serviceCv);
                System.out.println("Total per person: " + ((checkAmount + serviceCv) / count.length()));
                System.out.println("Tip per person: " + (serviceCv / count.length()));

            }


        }
    }
}
