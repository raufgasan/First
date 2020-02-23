package day48.employee;

 public abstract  class Employee {



   String name;
    int id;

    public Employee( ){};

     // WHY DO WE HAVE CONSTRUCTOR HERE
     // WE CAN NOT CREATE AN OBJECT OUT OF IT ?
     // WHAT IS THE POINT ?
     // So that sub class can reuse the code of setting id and name
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    };
    public abstract void calculateAnnualSalary();
    public abstract String toString();


}


//     Warm up
//----------
//abstract super class called Employee
//        instance fields : name , id
//        Constructor : to set all the fields
//abstract methods :
//        calculateAnualSalary
//        toString

//        HourlyEmployee
//        instance fields :
//        hourlyWage , numsOfHours ,
//        Constructor : to set all the fields
//        instance methods ;
//        calculateAnualSalary
//        toString
//        ----------------
//        FullTimeEmployee
//        instance fields :
//        monthlySalary
//        Constructor : to set all the fields
//        instance methods ;
//        calculateAnualSalary
//        toString