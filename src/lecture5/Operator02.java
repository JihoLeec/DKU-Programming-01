package lecture5;

public class Operator02 {
    public static void main(String[] args) {

        // 산술 연산자
        int a = 10 + 5;
        int b = 10 - 5;
        int c = 10 * 5;
        int d = 10 / 3;
        int e = 10 % 3;
        System.out.printf("%d %d %d %d %d\n", a, b, c, d, e);

        float f = 10/3.343f; // 이러면 소수점 까지도 나눗셈 가능
        System.out.println(f);
    }
}
