package AM.lecture5;

public class Operator01 {
    public static void main(String[] args) {
        // 부호 연산자
        int x = 10;
        int y = -x;
        int z = +y;
        System.out.println(y);
        System.out.println(z);

        // 증감 연산자
        int a = 10;
        int b = a++; // 후위 연산. 할당 연산 우선 수행 후 (b = 10, a=10), ++증가로 a=11
        int c = ++a; // 전위 연산. 증감 연산 우선 수행 후 (a=11), 할당 연산(c=11).
        System.out.println(b);
        System.out.println(c);
    }
}
