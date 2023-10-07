package DesignPatterns.Encapsulation;

import Encapsulation.Student;

public class SportsCouncil {
    StudentList sl = StudentList.getInstance();
    public void AddStudent(Student student){
        sl.addStudent(student);
    }
}
