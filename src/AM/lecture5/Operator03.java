package AM.lecture5;

public class Operator03 {
    public static void main(String[] args) {

        // 부동 소수점은 정확하지 않다.
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); //0.30000000000000004로 출력됨. 오차가 있음 ㅠ

        int c = (int)(a*100) + (int)(b*100);
        System.out.println(c/100.0); // 그래서 이렇게 정수 연산을 함.
    }
}
