package day55;

import java.util.ArrayList;
import java.util.List;

public class CourseX {


    String topic;
    List<Student> studentLst;

    public CourseX(String topic, List<Student> studentLst) {
        this.topic = topic;
        this.studentLst = studentLst;
    }

    // version of add student that accept Student object
    public void addStudent(Student s) {

        studentLst.add(s);

    }

    // version of add student that accept Student name and id
    // so we can create object inside the method and add to the list
    public void addStudent(String name, int ID) {

        Student s1 = new Student(name, ID);
        studentLst.add(s1);

    }


    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentLst=" + studentLst +
                '}';
    }


}
        class CourseXRunner {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        List<Student> myLst = new ArrayList<>();
        myLst.add(new Student("Muge", 101));
        myLst.add(new Student("Hasan", 102));
        myLst.add(new Student("Astrist", 103));
        myLst.add(new Student("Vlad", 104));
        myLst.add(new Student("Zehra", 105));
        myLst.add(new Student("Ayjeren", 106));


        CourseX java = new CourseX("HAS-A", myLst);

        java.addStudent("Goksel", 110);
        java.addStudent(new Student("Dilshat", 111));

        System.out.println("java = " + java);


    }


}

/////////////////////////////////////////////////////////////////////////////////////////////

        class Student {

    private String name;
    private int studentID;


    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}