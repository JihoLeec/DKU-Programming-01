package PM.lecture13;

public class Class01 {
    public static void main(String[] args) {
        Car carBMW = new Car(); // 가장 기본적인 객체 생성법. 당연히 Car객체는 힙에, carBMW는 스택에 있을 것
        carBMW.accelerate();

        Car carRambo = new Car("Blue","Rambo",0);
        carRambo.accelerate();
        System.out.println(carBMW.color+" "+carRambo.color);

    }
}
