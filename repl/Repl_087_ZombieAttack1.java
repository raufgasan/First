package repl;

import java.util.Scanner;

public class Repl_087_ZombieAttack1 {
    public static void main(String[] args) {


//        A variable inhabitants represents a city and its respective populations.
//        City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day,
//        a city will lose half of its population.write a program to loop the city population and make it lose half of its population
//        until no humans left. Print the each day like below for each day:

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int num =0;
        while (inhabitants>0){
            System.out.println ("Day "+ num + " ["+inhabitants+"]");
            inhabitants=inhabitants/2;
            num++;
        }

        System.out.println("---- EXTINCT ----");
    }
}