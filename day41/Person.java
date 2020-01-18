package day41;

public class Person {
  private   String name;
    private int age;
    private long ssn;


    public void setAll(String newName, int newAge, long newSssn){
        name=newName;
        age=newAge;
        ssn=newSssn;
    }


    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }




    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age=newAge;
    }



    public long getSsn(){
        return ssn;
    }

    public void setSsn(long newSsn){
        ssn=newSsn;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
