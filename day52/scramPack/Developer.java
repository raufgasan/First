package day52.scramPack;

public class Developer extends ScramTeam {

    static int devCount =1;

    public Developer(String Name, double salary){
        this.Name=Name;
        this.JobTitle="Developer"+devCount++;
        this.salary=salary;

    }

    @Override
    public void DaylyStanUp() {
        System.out.println("Developer "+Name+" is talking");

    }

    @Override
    public void Demo() {
        System.out.println("Developer "+Name+" doing demo");

    }
}
