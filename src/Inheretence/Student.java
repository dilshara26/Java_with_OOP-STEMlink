package Inheretence;

public class Student extends Person {


    public String studentId;

    public Student(String name, int age, String town,String studentId) {
        super(name, age, town);
        this.studentId = studentId;
    }
    public void printSI(){
        System.out.println(this.studentId);
    }
}
