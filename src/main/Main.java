package main;

import model.Person;
import model.student;
import model.Teacher;
import service.SchoolService;

public class Main {

    public static void main(String[] args) {

        student s1 = new student("Ali", 20, 101);

        Teacher t1 = new Teacher("Sara", 35, "Mathematics");

        SchoolService service = new SchoolService();

        service.addStudent(s1);

        System.out.println();

        t1.displayInfo();

        System.out.println();

        Person p = new student("John", 22, 202);

        p.displayInfo();

        System.out.println();

        s1.study();

        s1.study("Java");
    }
}