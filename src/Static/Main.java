package Static;

public class Main {
    public static void main(String[] args) {
//        Car mercedes = new Car("Mercedes CLA");
//        Car premio = new Car("Toyota Premio");
//        Car allion = new Car("Toyota Allion");
//        System.out.println(mercedes.getName());
//        System.out.println(mercedes.getNumberOfCars());
//
//        System.out.println(premio.getName());
//        System.out.println(premio.getNumberOfCars());


//        System.out.println(mercedes.getNumberOfCars());
//        System.out.println(premio.getNumberOfCars());
//        System.out.println(allion.getNumberOfCars());
//        System.out.println(Car.getNumberOfCars());
//        Car.setNumberOfCars(200);
//        System.out.println(Car.getNumberOfCars());

        CarSaleCar allion = new CarSaleCar("Allion");
        System.out.println(CarSaleCar.getNumberOfCars());
        CarSaleCar premio = new CarSaleCar("Premio");
        System.out.println(CarSaleCar.getNumberOfCars());
        CarSaleCar belta = new CarSaleCar("Belta");
        System.out.println(CarSaleCar.getNumberOfCars());

    }
}
