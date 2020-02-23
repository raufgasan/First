package task.school;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//create a class called AssociationExample:
//        create 5 objects of the students class
//creata a List of students called CybertekStudents and store those 5 objects into the List
//        create the object of the School and initialize school name to "Cybertek"
//        add two more new students "Denis" and "Irina" to cybertek school' student list
//        use for each loop to print out entire cybertek student' names

public class AssociationExample {
    public static void main(String[] args) {

        Student s1 = new Student("Rauf1");
        Student s2 = new Student("Rauf2");
        Student s3 = new Student("Rauf3");
        Student s4 = new Student("Rauf4");
        Student s5 = new Student("Rauf5");

        List<Student> cybertekStudents= new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        School sch = new School("Cybertek",cybertekStudents );

        sch.addNewStudent(new Student("Hasan"));

        Student [] arr = { new Student("Bla"),
                            new Student("Zirt")};
        sch.addNewStudent(arr);

        List<Student> lst = new ArrayList(Arrays.asList("Zurna","Balda"));
        sch.addNewStudent(lst);

        for (Student each: sch.allStudentsList ) {
            System.out.println(each);

        }

    }
}
