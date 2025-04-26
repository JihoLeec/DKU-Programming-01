package PM.lecture11;

import java.util.Arrays;

public class DeepArray02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = Arrays.copyOf(a, a.length);
        a[0] = 100;
        System.out.println(b[0]); // 1 출력. 당연히 복사값에 영향 없음

        String[] c = {"사과","바나나"};
        String[] d = Arrays.copyOf(c, c.length);
        c[0] = "딸기"; // 이러면 c[0]은 이제 힙의 "사과"에서 "딸기"를 가리키고, d는 그대로 사과를 가리키고 있음.
        System.out.println(d[0]); // 사과 출력. 힙에 있는 "사과"는 그대로 있다.
    }
}
