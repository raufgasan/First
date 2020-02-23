package day52.scramPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOA {
    public static void main(String[] args) {

        ScramTeam t1= new Testers("Hasan","SDET1",100);
        ScramTeam t2= new Testers("Rauf","SDET2",150);
        ScramTeam t3= new Testers("Israfil","SDET3",200);
        ScramTeam t4= new Testers("Kamran","SDET4",300);
        ScramTeam t5= new Testers("Irina","SDET5",400);

        ScramTeam [] testersArr = {t1,t2,t3,t4,t5};
//        for (ScramTeam eachTes:testersArr ) {
//            eachTes.getEmployeeInfo();
//
//        }




        ScramTeam d1= new Developer("BOb",100);
        ScramTeam d2= new Developer("Mack",150);
        ScramTeam d3= new Developer("Zirt",200);
        ScramTeam d4= new Developer("Pirt",300);
        ScramTeam d5= new Developer("Mirt",400);

        ScramTeam [] devArr = {d1,d2,d3,d4,d5};
//        for (ScramTeam eachDev:devArr ) {
//            eachDev.getEmployeeInfo();
//
//        }


        List<ScramTeam> scrum = new ArrayList<>();
        scrum.addAll(Arrays.asList(testersArr));
        scrum.addAll(Arrays.asList(devArr));

        for (ScramTeam each: scrum ) {
            each.getEmployeeInfo();

        }




    }
}
