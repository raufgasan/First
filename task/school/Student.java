package task.school;

public class Student {

//    instance variables: String studentName
//    initialize the ins variable within a constructor

    String studentName;

    public Student(String studentName){
        this.studentName=studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}
