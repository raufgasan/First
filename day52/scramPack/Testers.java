package day52.scramPack;

public class Testers extends ScramTeam {

    public Testers(String Name, String JobTitle, double salary){
        this.Name=Name;
        this.JobTitle=JobTitle;
        this.salary=salary;
    }

    @Override
    public void DaylyStanUp() {
        System.out.println("Testers "+Name+" is talking");

    }

    @Override
    public void Demo() {
        System.out.println("Testers "+Name+" doing demo");

    }
}
