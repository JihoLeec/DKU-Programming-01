package PM.lecture11;

public class CopyRemind01 {
    public static void main(String[] args) {
        // 값 복사, copy-by-value
        int a=10,b=a;
        b=20;
        System.out.println(a);

        // 주소 복사, copy-by-reference
        String aa="딸기", bb=aa;
        aa="바나나";
        System.out.println(aa+" "+bb);
        // 이거는 문자열 리터럴을 새로 생성해서 다른 값을 출력함

        int[] aaa = {1,2,3};
        int[] bbb = aaa;    // 그대로 주소 복사
        bbb[0]=999;
        System.out.println(aaa[0]+" "+bbb[0]);
        // 배열이 가리키는 메모리 부분의 값이 바뀜. 따라서 bbb[0] = aaa[0] = 999.
    }
}
