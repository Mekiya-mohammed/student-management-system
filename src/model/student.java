package model;

public class student extends Person {

    private int studentId;

    public student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {

        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void study(String subject) {
        System.out.println(name + " is studying " + subject);
    }
}