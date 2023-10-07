package DesignPatterns.Encapsulation;

import Encapsulation.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    private static StudentList instance = null;

    private List<Student> students;

    private StudentList() {
        students = new ArrayList<>();
    }

    public static StudentList getInstance() {
        if (instance == null) {
            instance = new StudentList();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.remove(studentId);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void getStudentsName(){
        for (Student st:students) {
            System.out.println(st.name);
        }

    }
}