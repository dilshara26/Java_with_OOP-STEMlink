package UpcastingTute;

public class StudentRecord {
    public static void main(String[] args) {

//        Parent object
        Student josh = new Student("Josh",88,12);
        josh.isEligibleForGraduation();
        // try calling some getter methods


//        child object
        GraduateStudent jane = new GraduateStudent("Jane", 22,21, true);
        jane.isEligibleForGraduation();
        System.out.println(jane.getHasAnInternship());


//        Upcasting
        Student john = new GraduateStudent("Jone",13,22,false);
        john.isEligibleForGraduation();
//        you would not be able to call the getter methods of child
//        john.getHasAnInternship();




    }

}
