package day42;

public class Computer {

    public String brand;
    private int ram;
            double price;


    public void runProgram(){
        System.out.println(this.brand+"is running program with the ram size "+ ram);
    }

    public void calculate(){
        System.out.println(brand+"is cal");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram>=1&&ram<=128){
        this.ram = ram;}
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>20){
        this.price = price;}
    }


    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
