package Encapsulation;

public class Person {
    public String vehicleType = "Car";
    // Private fields - encapsulate personal data
    private String name;
    private int age;
//    protected field
    protected String country = "Sri Lanka";
//    default field
    String nationality ="Sri Lankan";

    // Constructor to initialize personal data
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public methods - provide controlled access

    // Getter methods - allow read access to private fields

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
