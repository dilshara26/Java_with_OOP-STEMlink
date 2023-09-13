package Polymorphism;

public class AddCalculator {
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two double values
    public int add(double num1, double num2) {
        return (int) (num1 + num2);
    }

    // Method to concatenate two strings
    public int add(String str1, String str2) {
        int str1Int = Integer.parseInt(str1);
        int str2Int = Integer.parseInt(str2);
        return str1Int + str2Int;
    }

}
