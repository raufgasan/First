package day39.studentPack;


/*
 * Any time you create a class , it will become a blue print for object
 * And this class type can be a type for variable
 * for example String has it's own class so we can create a String variable
 * and assign a String object
 *
 * in here student become a blue print for creating student object '
 * and any student object has 3 attributes defined by instance field|variable
 *
 * */

public class Student {


    String name;
    int age;
    char gender;



}
/*
*
Variable types :
according to what kind of data it store :
	primitive variable -->> pure value
	reference variable -->>
					the pointer to the object in the heap
					the address of the obejct in the heap
					remote of the TV
					leash of the dog
according to the location it shows up :
	 inside method : --> local variable
	 inside ( ) of method header -->>
	 				method parameter
	 outside method inside class
	 		--> Field
	 			instance field or instance variable
	 			static filed (will learn later)
* */
