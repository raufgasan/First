package day50;

public class Devision extends Question {

    public Devision(int num1, int num2) {
        super("/", "Division question");
        if (num1<num2){
            int  temp=num1;
            num1=num2;
            num2=temp;
        }

        this.num1=num1;
        this.num2=num2;


    }


    @Override
    public void calculate(){

        if(num2==0)
            answer=0;
        answer= num1/num2;
        calculated=true;
    }



    @Override
    public String toString(){
        if (calculated)
            return super.toString()+ num1+operator+num2+"="+answer;
        else
            return super.toString()+num1+operator+num2+"=";

    }

}
