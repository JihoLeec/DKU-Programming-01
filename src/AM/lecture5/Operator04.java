package AM.lecture5;

public class Operator04 {
    public static void main(String[] args) {
        // int result = 5/0; <- 컴파일 오류. 0으로 나눌 수 없음

        double result1 = 5.0/0.0;
        double result2 = -5.0/0.0;
        System.out.println(result1); // Infinity
        System.out.println(result2); // -Infinity

        double result3 = 0.0/0.0; // NaN
        System.out.println(result3);

        // 그냥 속 편하게 0으로 나누지 말자.
    }
}
