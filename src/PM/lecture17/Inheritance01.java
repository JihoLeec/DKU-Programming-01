package PM.lecture17;

public class Inheritance01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Tesla";
        car.start();
        car.honk();
        System.out.println(car.wheels);
        System.out.println(car.model);

    }
}
