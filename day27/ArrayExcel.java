package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExcel {
    public static void main(String[] args) {


//        Excel Task 2D Array Version:
//        You have Excel sheet with 6 rows and 4 columns
//        and it contains below data:
//        First store those data in 2 dimensional array
//        then write a logic to print out in below format.
//        Below output is expected from your program:
//        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
//        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
//        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
//        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
//        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
//        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34


        int[][] nums = {{78, 54, 100, 84}, {33, 44, 77, 123}, {12, 88, 52, 76}, {67, 33, 98, 97}, {12, 88, 52, 45,}, {67, 33, 98, 34}};

        for (int x = 0; x < nums.length; x++) {
            System.out.println();
            for (int i = 0; i < nums[x].length; i++) {
                System.out.print("Cell(" + (x + 1) + "," + (i + 1) + ")= " + nums[x][i] + "  ");


            }
        }


        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row you are looking for: ");
        int row = scan.nextInt();
        System.out.println("Enter column number you are looking for: ");
        int column= scan.nextInt();


        if (row<=4&&column<=6){
            System.out.println(" row "+row+" and column "+column+" has "+nums[row-1][column-1]);
        }else if (0>row&&row>4&&0>column&&column>6){
            System.out.println("INVALID! There are only 6 row and 4 columns");

        }
        System.out.println("\n=================================Write a program to ask user row and column number and return the value in that cell. if it's invalid row or column number , it should print invalid input.");
//        1, Write a program to ask user row and column number and return the value in that cell. if it's invalid row or column number , it should print invalid input.
//        for example : row 1 and column 4 has 84
//        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
//        Optionally : keep asking user until the user input row and column are not out of range.
        int row1 = 0;
        int column1 = 0;
        boolean res = true;

        do {
            System.out.println("Enter row you are looking for: ");
           row1 = scan.nextInt();
            System.out.println("Enter column number you are looking for: ");
            column1= scan.nextInt();
            if (0>row||row>4||0>column||column>6){
                System.out.println("INVALID! There are only 6 row and 4 columns");
               break;
            }else{

            System.out.println(" row "+row+" and column "+column+" has "+nums[row-1][column-1]);}

        }while (res==false);


//        2, Write a program to search a value in excel and print the all location of the value :
//        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)

        System.out.println("\n========================Write a program to search a value in excel and print the all location of the value :");
        System.out.println("Enter number you are looking for");
        int search = scan.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {


                if (nums[i][j] == search) {
                    System.out.print(search);
                    System.out.println(" --> Cell (" + (i + 1) + "," + (j + 1) + ")");


                }
            }

        }


        System.out.println("\n===================Write a program to ask user for column number and print only that column data :");

//        3, Write a program to ask user for column number and print only that column data :
//        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33

        System.out.println("Enter colunm number you are looking for: ");
            int columnNum= scan.nextInt();
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i][columnNum-1]+", ");

        }








    }
}
