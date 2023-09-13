package Inheretence;

public class SimpleLocation {
    public double latitude;
    public double longitude;
    public int answer;

    public SimpleLocation(double latIn, double lonIn) {
        this.latitude = latIn;
        this.longitude = lonIn;
    }
    public void addNumbers(int num1, int num2){
        answer = num1+num2;
    }
    public void printNumbers(){
        System.out.println(answer);
    }

}