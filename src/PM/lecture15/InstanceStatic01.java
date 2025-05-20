package PM.lecture15;

public class InstanceStatic01 {
    public static void main(String[] args) {
        double area = 10 * 10 * Calculator.pi;
        // 정적 변수는 생성자를 선언하지 않고도 바로 불러올 수 있음
        // 메소드 영역에 저장되어 있어 모든 객체가 공유하기 때문이다.
        System.out.println(area);
        Calculator.count++;

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();

        calc1.color = "red";
        calc2.color = "blue";

        calc1.count++;
        System.out.println(calc1.count+" "+calc2.count+" "+Calculator.count);
        // 전부 2로 출력됨. 정적 변수는 공통 데이터기에 그렇다.

    }
}
