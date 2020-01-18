package day41;

public class Product {

    String name;
    double price;

    public String getName (){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        if (newPrice>0)
        price=newPrice;
    }

}
