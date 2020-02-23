package day44.coursePack;

public class CourseCreator {
    public static void main(String[] args) {


        System.out.println("Course.counter = " + Course.counterStatic);

        Course c1 = new Course("Java", "foundation");
        System.out.println("c1 = " + c1);
        Course c2 = new Course("Selenium", "Automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Webservices");
        c4.test(35);
        Course c5 = new Course("Agile", "Soft Skills");
        Course c6 = new Course("AWS", "Cloud");
        System.out.println("c6 = " + c6);
      //System.out.println(Course.countInt);
        System.out.println(Course.counterStatic);


        System.out.println("Course.counter = " + Course.counterStatic);

        Course i1=new Course();

            i1.test(25);
        System.out.println(i1);
    }

}
