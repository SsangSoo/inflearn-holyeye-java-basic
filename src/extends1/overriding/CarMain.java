package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        Car electricCar2 = new ElectricCar();
        electricCar2.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
