package Static;

public class CarSaleCar {
    public static int numberOfCars = 0;
    private String name;
    private int speed;

    public CarSaleCar(String name) {
        this.name = name;
        this.speed = 0;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed++;
    }

    public void decelerate() {
        speed--;
    }


    public static void  setNumberOfCars(int val){
        numberOfCars = val;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}