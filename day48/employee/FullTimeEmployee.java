package day48.employee;

public class FullTimeEmployee extends Employee {

    // a non-abstract sub class of abstract super class
// is called concrete class
// This class is responsible providing body (implementation)
// for all abstract methods from super class.

   double monthlySalary;

    public FullTimeEmployee(String name, int id, double  monthlySalary) {
        super(name,id);
        this.monthlySalary = monthlySalary;

    }


    @Override
    public  void calculateAnnualSalary(){
        System.out.println("Annual Salary Hourly Employee = " + (monthlySalary * 12));

    };

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , yearly salary "+(monthlySalary * 12)+
                '}';
    }
}
