package PM.lecture11;

import java.util.Arrays;

public class DeepArray03 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = Arrays.copyOf(arr1, arr1.length);

        arr1[0][0] = 999;
        System.out.println(arr2[0][0]); // 당연히 안바뀌어야 할 것 같은데 바뀐다. why?
        /**
         * 2차원 배열을 특이하게 바깥 배열만 새로 만들고 안쪽 객체는 그대로 공유한다.
         * => 바깥 배열은 깊은 복사를, 안쪽 배열은 얕은 복사를 한다.
         * arr1 -> [[1,2],[3,4]]
         * arr2 -> [ 위 가리킴, 위 가리킴 ]
         * 결국 주소만 복사해옴.
         */
        System.out.println(arr1[0]==arr2[0]);   // 그래서 주소를 비교하면 true가 나온다.
        // -> 깊은 복사는 값 그 자체를 복사하는 것. 얕은 복사는 주소를 복사하는 것.
        // 2차원 배열에서 깊은 복사를 하려면 무조건 반복문으로 직접 복사하는 방법밖에 없다.
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length);
        }
    }
}
