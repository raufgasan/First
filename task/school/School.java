package task.school;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class School {
//    instance variables: String schoolName
//    List<Student> AllStudentsList;
//    initialize instance variables within a constrcutor
//    create a method called addNewStudent() that can add students to the AllStudentsList

    String schoolName;
    List<Student> allStudentsList;

    public School( String schoolName, List<Student> allStudentsList ){
        this.schoolName=schoolName;
        this.allStudentsList=allStudentsList;

    }

    public void addNewStudent(Student student){
        allStudentsList.add(student);

    }


    public void addNewStudent(Student [] student){
        allStudentsList.addAll(Arrays.asList(student));

    }


    public void addNewStudent(List<Student>student){
        allStudentsList.addAll(student);

    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", allStudentsList=" + allStudentsList +
                '}';
    }
}
