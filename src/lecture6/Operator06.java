package lecture6;

public class Operator06 {
    public static void main(String[] args) {
        // 기본 대입 연산. 할당 연산인듯
        int a = 10;
        a+=5; // a=a+5; 복합 대입 연산자
        System.out.println(a);

        // 삼항(조건) 연산자, 중첩이 가능하다.
        int x=10,y=20;
        System.out.println(x>y?x:y);
        System.out.println(x>0?"양수":x<0?"음수":"0");

        // 연산의 방향, 연산자 우선순위
        int A,b,c; A=b=c=5; // 얘는 오른 쪽부터 됨

    }
}
