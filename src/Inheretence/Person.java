package Inheretence;

public class Person {

    public String name;
    public  int age;
    public  String town;



    public Person(String name, int age, String town){
        this.name = name;
        this.age = age;
        this.town = town;

    }

    public void welcomeMessage(){
        System.out.println(this.name + " hello");
    }


}
