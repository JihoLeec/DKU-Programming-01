package lecture5;

public class Operator05 {
    public static void main(String[] args) {

        // 비교 연산자
        int a = 10, b = 20;

        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        
        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 < char2); // true. 유니코드 연산
    }
}
