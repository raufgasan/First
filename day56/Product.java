package day56;

import day46.programerPack.Programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product extends Object{
//    Create a class called Product with encapsulated fields name, price and constructor
//            override the .equals method coming from Object class :
//    Two products should be equal if they have the same fields value.
//    Practice Association: important
//    create a class called Store

//    Create an instance void method called addProduct(Product p)
//    Create an instance void method called removeProduct(Product p)
//    Create an instance void method called checkIfProductExist(Product p)
//    Hint : just call list remove method, it will internally call .equal method to decide which one to remove
//    more methods : find and return max price product, Find sum.of all products
//    Find list of products more than average




     private String name;
      private double  price;

        public Product(String name, double price){
            this.name=name;
            this.price=price;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override// require same exact method signature
        public boolean equals(Object obj) {


            // down-casting from type Object to Product
            // because in order to access Product only field
            // we need to refer the object as Product
            Product otherPruduct = (Product)obj;

            // how to compare this name and price to whatever user passed
            return this.name.equals(otherPruduct.name) && this.price==otherPruduct.price ;
        }

               @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }


    }




