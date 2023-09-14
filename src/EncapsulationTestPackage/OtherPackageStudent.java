package EncapsulationTestPackage;

import Encapsulation.Person;

public class OtherPackageStudent extends Person {
    public OtherPackageStudent(String name, int age) {
        super(name, age);
    }
    public void printInfo(){
        System.out.println(super.country);
        System.out.println(super.vehicleType);
    }
}
