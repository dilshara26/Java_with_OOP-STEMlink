package Encapsulation;

public class RunnerClass {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 20);
        System.out.println(p1.getName());

        System.out.println(p1.getName());




        // Create a student object
        Student student = new Student("Alice", 20, 12345);
        // Access personal information using parent class methods
//        System.out.println("Student Name: " + student.getName());
//        System.out.println("Student Age: " + student.getAge());
//
////        accessing protected and default variables
//        System.out.println("Students Country "+ student.country );
//        System.out.println("Students Nationality "+ student.nationality );
//
//        // Access student-specific information
//        System.out.println("Student ID: " + student.getStudentId());
//
    }
}
