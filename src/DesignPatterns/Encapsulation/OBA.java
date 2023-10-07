package DesignPatterns.Encapsulation;


import Encapsulation.Student;

public class OBA {
    StudentList sl = StudentList.getInstance();
    public void AddStudent(Student student){
       sl.addStudent(student);
    }
}
