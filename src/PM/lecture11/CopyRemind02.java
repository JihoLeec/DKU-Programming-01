package PM.lecture11;

import java.util.Arrays;

public class CopyRemind02 {
    public static void main(String[] args) {
        // 얕은 복사 (Shallow Copy)
        String[] a = {"사과", "바나나"};
        String[] b = a;
        a[0] = "딸기";
        b[1] = "포도";
        System.out.println(b[0]+" "+a[1]);
        // 이거는 배열이라서 문자 리터럴을 생성하며 값도 바뀐다.

        // 깊은 복사 (Deep Copy)
        String[] aa = {"사과", "바나나"};
        String[] bb = Arrays.copyOf(aa, aa.length);

        aa[0] = "딸기";
        System.out.println(bb[0]);
        // bb는 값 자체를 복사했기에 변하지 않는다. 이게 아직 이해가 안되네;; 무조건 이러면 주소만 복사 아니었나
    }
}
