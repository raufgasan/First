package day30;

public class CarArray {
    public static void main(String[] args) {



    String car[] =  {
            "Acura-NSX",
                    "Chevrolet-Corvette",
                    "Chevrolet-Cavalier",
                    "BMW-3 Series",
                    "Pontiac-LeMans",
                    "BMW-7 Series",
                    "Oldsmobile-Achieva",
                    "Honda-Civic"};
        int countCarChev=0;
        int countCarCivic=0;
        for (int i = 0; i <car.length ; i++) {

            if (car[i].toLowerCase().contains("chevrolet")){
                countCarChev++;

            }
            if (car[i].toLowerCase().contains("civic")){
                countCarCivic++;
            }

        }

        System.out.println(countCarChev);
        System.out.println(countCarCivic);
    }
}

