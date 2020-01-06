package day37;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class TeamNameList {
    public static void main(String[] args) {


//        Two way to create ArrayList

//        ArrayList<String>teamMates=new ArrayList<>();

          List<String> teamMates= new ArrayList<>();


        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");


        System.out.println("teamMates = " + teamMates);

//        first item
        System.out.println("First Item = " + teamMates.get(0));

//        last item --->using last index--->size()-1
        System.out.println("Last Item = " + teamMates.get(teamMates.size()-1));


        for (int x = 0; x <teamMates.size() ; x++) {

           System.out.println("Name "+ (x+1) +" = " + teamMates.get(x)+ "\tIndex = "+x);

          }

        System.out.println("\nALL NAME");
        for (int x = teamMates.size()-1; x >=0 ; x--) {

            System.out.println("Name "+ (x+1) +" = " + teamMates.get(x));

        }


        System.out.println("\nPrint 2 Names at the time:");
        for (int x = 0; x <=teamMates.size()-2 ; x++) {


            System.out.println("\t"+teamMates.get(x)+"\t "+teamMates.get(x+1));
        }


        System.out.println("\nPrint 2 Names at the time:");
        for (int x = 0; x <=teamMates.size()-2 ; x+=2) {


            System.out.println("\t"+teamMates.get(x)+"\t "+teamMates.get(x+1));
            if(x==teamMates.size()-3) {
                if (teamMates.size() % 2 == 1) {
                    System.out.println("\t"+teamMates.get(teamMates.size() - 1));

                }
            }
        }



        System.out.println("\nPrint 3 Names at the time:");
        for (int x = 0; x <=teamMates.size()-3 ; x+=3){

            System.out.println("\t"+teamMates.get(x)+"\t "+teamMates.get(x+1)+"\t "+teamMates.get(x+2));

        }


        
        
//
        System.out.println("\nconcat everyone in one string separated by -");
        String result= "";
        for (int i = 0; i <teamMates.size() ; i++) {
            if (teamMates.size()-1==i) {
                break;
            }
            result=result+teamMates.get(i)+"-";

        }
        System.out.println("result = " + result+teamMates.get(teamMates.size()-1));


        String lstToString = teamMates.toString();
        System.out.println("lstToString after replacing  = \n\t"
                + lstToString.replace(", ", "-")
                              .replace("[", "")
                              .replace("]", ""));
    }
}
