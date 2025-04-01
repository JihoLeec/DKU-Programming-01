package lecture6;

public class HighOperator01 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);

        // Short-Circuit Evaluation, 단락 평가
        int x = 10;

        // x>0이 true 이므로 뒤 조건은 평가하지 않는다.
        boolean result = (x>0) || (x++>100);
        System.out.println(x); // 따라서 10 출력.

    }
}
