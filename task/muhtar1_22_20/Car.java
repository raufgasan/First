package task.muhtar1_22_20;

public class Car {

    public void start(){
        System.out.println("Started a car ");
    }
}
/*
* Rules of OVERRIDING
* 1. must be overridden in sub class (inherited relation) can not be in same class
* 2. return-type, method name, parameter MUST be same
* 3. Overridden" Access modifier has to be same or more visible
*       (can not be overriding private method)
*       public->protected->default->
*4. Only instance method can be overridden
*       (cannot be static, private, final)
* 5. @Override Must be applicable
* */