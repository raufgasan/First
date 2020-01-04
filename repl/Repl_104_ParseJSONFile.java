package repl;

import java.util.Scanner;

public class Repl_104_ParseJSONFile {
    public static void main(String[] args) {



//        Web service is something that provides data as a service over the HTTP (Hypertext Transfer Protocol) protocol.
//            Web pages allow people to communicate and collaborate with each other. Web services allow programs to communicate and collaborate with each other.
//                REST is used to build Web services that are lightweight, maintainable, and scalable in nature. A service which is built on the
//        REST architecture is called a RESTful service.
//        The underlying protocol for REST is HTTP, which is the basic web protocol. REST stands for Representational State Transfer.
//                RESTful web service permits different data format such as Plain Text, HTML, XML and JSON.


//        JSON stands for JavaScript Object Notation
//        JSON is a lightweight format for storing and transporting data
//        JSON is often used when data is sent from a server to a web page
//        JSON is "self-describing" and easy to understand
//        Note: ( JavaScript it's also language, don't confuse with Java)
//        TASK
//        In this task, we gonna talk about JSON files. JavaScript Object Notation (JSON) -  is a language-independent data format. Write a program that will parse
//        JSON file, and print out into the console first name and last name as displayed in the example below. In this task, JSON file will be provided as a String variable.
//        Example:
//        input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
//        output:
//        First name: James
//        Last name: May



        Scanner scan = new Scanner(System.in);
        String json = "{\"id\": 1934, \"firstName\": \"James\", \"lastName\": \"May\", \"role\": \"student-team-member\"}";

        int firstNamein = json.indexOf("\"firstName\"");
        int firstNameEns = json.indexOf(",",firstNamein);

        System.out.println(firstNameEns);

       int lasNamein = json.indexOf("\"lastName\"");
        int lastNameEnd = json.indexOf(",", lasNamein);
       System.out.println("First name: " +json.substring(firstNamein+14,firstNameEns-1));
        System.out.println("Last name: " +json.substring(lasNamein+13,lastNameEnd-1));













    }


}

