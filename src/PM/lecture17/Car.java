package PM.lecture17;

public class Car extends Vehicle {
    int wheels = 4;

    Car() { // 기본 생성자는 항상 컴파일러가 자동 추가하므로 굳이 이것을 작성하지 않아도 된다
        super();
    }
    void honk() {
        System.out.println("빵빵");
    }

}
