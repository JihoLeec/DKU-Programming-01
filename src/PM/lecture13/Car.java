package PM.lecture13;

public class Car {
    String color;
    String model;
    int speed;
    
    public Car() { // 기본 생성자, 반드시 클래스 명과 같아야 함. 초기화 역할을 해줌
        color = "Red";
        model = "BMW";
        speed = 0;
        System.out.println("BMW를 획득했다!");
    }
    public Car(String color, String model, int speed) { // 생성자. 초기 값을 주며 생성할 때
        this.color = color;
        this.model = model;
        this.speed = speed;
        System.out.println(model+"를 획득했다!");
    }
    public void accelerate() {
        speed += 10;
        System.out.println("가속!!");
    }

}
