package day52.scramPack;

abstract class ScramTeam {
    public String Name, JobTitle;
    public double salary;

    public abstract void DaylyStanUp();
    public abstract void Demo();


    public void getEmployeeInfo(){
        System.out.println("-------------------------");
        System.out.println("Name: "+Name);
        System.out.println("Title: "+JobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("-------------------------");
    }


}
