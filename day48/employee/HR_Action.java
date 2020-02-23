package day48.employee;

import java.util.Arrays;
import java.util.List;

public class HR_Action {
    public static void main(String[] args) {
//        HourlyEmployee h1 = new HourlyEmployee("Rauf", 314, 60,2000);
//        System.out.println("h1 = " + h1);
//        HourlyEmployee h2= new HourlyEmployee("Nailya", 315, 75, 2000);
//        System.out.println("h2 = " + h2);
//
//
//        FullTimeEmployee f1 = new FullTimeEmployee("Rauf", 314, 5000);
//        System.out.println("f1 = " + f1);
//        FullTimeEmployee f2= new FullTimeEmployee("Nailyam", 315, 10000);
//        System.out.println("f2 = " + f2);

        Employee a1 = new HourlyEmployee("Nailya", 315, 75, 2000);
//        a1.calculateAnnualSalary();
                a1 = new FullTimeEmployee("Nailyam", 315, 10000);
//        a1.calculateAnnualSalary();

        Employee a2 = new HourlyEmployee("Rauf", 314, 60,2000);
        Employee a3 = new HourlyEmployee("Faig", 311, 25, 2000);
//        a2.calculateAnnualSalary();
//        a3.calculateAnnualSalary();


        List<Employee> e1 = Arrays.asList(a1,a2,a3);
        for (Employee each: e1 ) {
            System.out.println("each = " + each);
            System.out.println("each.name = " + each.name);
            each.calculateAnnualSalary();

        }

    }
}
