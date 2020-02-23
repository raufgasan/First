package task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shape {


    double radius;
    double height;
    final double pI=3.14;

   public void Area(){
       System.out.println("Area = " + 0);
   }
    public void perimeter(){
        System.out.println("perimeter = " + 0);
    }
    public void capacity(){
        System.out.println("capacity"+0);
    }


    static void add(int x, int y){}
    static void add(int x){}


    public static void main(String[] args) {


//        Rectangle r1=new Rectangle(10,20);
//        r1.Area(); //200
//        r1.perimeter();//400
//
//        Square s1= new Square(10);
//        s1.Area();
//        s1.perimeter();
//
//
//        Circle si1=new Circle(10);
//        si1.Area();
//        si1.perimeter();
//        Cylinder sy= new Cylinder(10, 20);

        int [] num = new int[] {1,2,3,4,5};

        for (int i = 0; i <num.length ; i++) {
           num[i]= num[i]*2;

        }
        System.out.println(Arrays.toString(num));
    }


}


class Circle extends Shape{
//    A=πr2  area
//    C=2πr  perimeter+
    double radius;
    public Circle(double radius){this.radius=radius;}
    @Override
    public  void   Area(){  double area= pI*radius*radius;
        System.out.println("Area of Circle"+area); }
    public  void perimeter(){   double perimeter= pI*radius*2;
        System.out.println("perimeter of Circle"+perimeter);}
    public  void capacity(){}

}
class Rectangle extends Shape{
//    A=wl  area
//    P=2(l+w)  perimeter+

    double length;
    double width;

    public Rectangle (double length, double width ){this.length=length; this.width=width;}


    @Override
    public void  Area(){double area=  width*length;
        System.out.println("Area of Rectangle"+area);}
    @Override
    public  void perimeter(){double perimeter= 2*(width+length);
        System.out.println("perimeter of Rectangle"+perimeter);}

}
class Square extends Shape{
//    A=a2  area
//    P=4a  perimeter

    double side;

    public Square(double side){this.side=side;}

@Override
    public void    Area(){double area=  side*side;
    System.out.println("area of Square"+area);}
    @Override
    public  void perimeter(){double perimeter= 4*(side*side);
        System.out.println("perimeter of Square"+perimeter);}

}
class Cylinder extends Shape{
   // A=2πrh+2πr2  area

    public Cylinder(double radius, double height){this.radius=radius; this.height=height;}


   @Override
   public  void Area(){double area=  (2*pI*radius*radius)+height*(2*pI*radius);
       System.out.println("Area of "+area);
    }
    @Override
    public  void perimeter(){ double perimeter= 2*(pI*radius*radius+height);
        System.out.println("Cylinder of perimeter");

    }


}




