package day49.drawablePack;

public class Circle extends Shape{


    int radius;

    public Circle(String name, int radius){
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        area=radius*radius*Math.PI;

    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with 90 degree");
    }
    @Override
    public String toString() {
        return "Circle{" +
                "length=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


}
