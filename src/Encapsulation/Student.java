package Encapsulation;
public class Student extends Person {
    // Private field in the Student class
    private int studentId;

    // Constructor to initialize student data
    public Student(String name, int age, int studentId) {
        super(name, age); // Call the parent class constructor
        this.studentId = studentId;
    }

    // Public method to access student ID
    public int getStudentId() {
        return studentId;
    }
    public void printDetails(){

        // Access personal information using parent class methods
        System.out.println("Student Name: " + super.getName());
        System.out.println("Student Age: " + super.getAge());

//        accessing protected and default variables
        System.out.println("Students Country "+ super.country );
        System.out.println("Students Nationality "+ super.nationality );

    }


}