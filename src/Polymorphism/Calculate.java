package Polymorphism;

public class Calculate {
    public static void main(String[] args){
        AddCalculator ac = new AddCalculator();
        System.out.println(ac.add("2","5"));
        System.out.println(ac.add(2.0,5.0));
        System.out.println(ac.add(2,5));
    }

}
