package AM.lecture6;

public class Complement {
    public static void main(String[] args) {
        // 2의 보수법
        // 0000 0101 -> 5
        // 1111 1010 모든 부호 반전
        // 1111 1011 -> -5. +1을 해준다.

        int a = 5,b=3; // 0101,0011
        System.out.println(Integer.toBinaryString(a)); // 101(앞에 0붙는건 다 삭제됨)
        System.out.println(Integer.toBinaryString(b)); // 11

        // 비트 연산자
        System.out.println(a&b); // 1 <- 0001
        System.out.println(a|b); // 7 <- 0111
        System.out.println(a^b); // 6 <- 0110
        System.out.println(~a); // -6 <- 1010(-1 하면 1001 -> 0110)
    }
}
