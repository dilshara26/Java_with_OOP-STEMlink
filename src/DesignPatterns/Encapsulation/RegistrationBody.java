package DesignPatterns.Encapsulation;

import Encapsulation.Student;

public class RegistrationBody {
    public static void main(String[] args) {
        OBA oba = new OBA();
        Student harith = new Student("Harith",23,334);
        oba.AddStudent(harith);
        Student janaka = new Student("Janaka",23,334);
        SportsCouncil sc = new SportsCouncil();
        sc.AddStudent(janaka);
        StudentList sl= StudentList.getInstance();
        sl.getStudentsName();

    }

}
