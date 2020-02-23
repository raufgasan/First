package day41.ProductPack;

public class Product {

    // this keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    // this.fieldName
    // only can be used inside instance method (and later constructor)

    private String name;
    private double  price;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }


    public String toString(){
        return "Name"+name+"price"+price;
    }


}
