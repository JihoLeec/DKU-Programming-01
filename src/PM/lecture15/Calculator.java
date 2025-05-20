package PM.lecture15;

public class Calculator {

    // static 필드
    static double pi = 3.141592;
    static int count = 0;

    // 인스턴스 필드
    String color;

    // static 메소드
    static double calcCircleArea(double radius) {
        // System.out.println(color);
        // 컴파일 오류. 스태틱 메소드에서는 힙에 저장된 인스턴스를 참조할 수 없음
        return pi * radius * radius;
    }
    // 인스턴스 메소드
    void ChangeColor(String newColor) {
        this.color = newColor;
        double area = calcCircleArea(pi);
        // 얘네가 스태틱을 참조하는건 됨
    }
}
