package PM.lecture11;

import java.util.Arrays;

public class DeepArray01 {
    public static void main(String[] args) {
        int[] source = {1,2,3,4,5};
        int[] target = new int[source.length]; // 저기에 꼭 숫자만 넣을 필요 없다.

        for(int i=0;i<source.length;i++) {  // 복사 방법1: 각각 직접 복사
            target[i] = source[i];
        }

        // 복사 방법 2: 내부적으로 최적화되어 있어 대용량 데이터에 효율적. 또한 부분 복사도 가능하다.
        System.arraycopy(source,0,target,0,source.length);
        //             원본 배열, 원본 시작위치, 대상 배열, 대상 시작위치, 총 복사 길이

        int[] target2 = Arrays.copyOf(source,source.length);
        // 복사 방법 3: 새 배열을 생성함과 동시에 복사해줌.
        // 만약 길이를 원본 배열보다 늘리면 남는 공간은 기본값으로 채워진다. 보다 줄이면 해당 것만 복사
        // 단점: 원하는 부분만 복사를 할 수는 없음
        
        // 세 방법 모두 기본 타입은 값 복사, 주소 타입은 주소 복사로 된다.
    }
}
