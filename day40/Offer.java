package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;




    public void displayInFormation (){

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);



    }

    public void turnToFullTime(){

        if (isFullTime==false){
            isFullTime=true;
        }else {
            System.out.println("Already FullTime");
        }





    }


    public void changeLocation (String newLocation){
        location = newLocation;
    }

    public void chageAllInfo(String newCompany,
                             String newLocation,
                             long newSalary,
                             boolean newIsFullTime){


        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;

        displayInFormation();
    }

    public boolean isHundredKOffer(){

        return salary>=100000;
    }





}
