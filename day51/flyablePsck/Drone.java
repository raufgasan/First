package day51.flyablePsck;


//  a class    implements  an  interface
//  an interface   extends  another  interface
//  a class    extends   class


import day51.flyablePsck.UprightFlyable;

public class Drone implements UprightFlyable {


        @Override
        public void flyUpright() {
            System.out.println("Flying upright ");
        }

        @Override
        public void fly() {
            System.out.println("Flying regulartly ");
        }


    }