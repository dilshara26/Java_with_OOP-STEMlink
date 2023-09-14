package EncapsulationTestPackage;

import Encapsulation.Person;

public class NonChildClass {
    public void printInfo(){
        Person person = new Person("Mark",33);
        System.out.println(person.vehicleType);
    }
}
