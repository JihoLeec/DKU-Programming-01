package PM.lecture11;

public class ForEach01 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[][] matrix = {{1,2,3},{4,5,6}};
        // 장점: 훨씬 간결하고 인덱스 계산 오류 방지.
        // 단점: 인덱스 접근을 못해 값 수정이 불가능한 읽기 전용.
        for(int number : numbers) {
            System.out.println(number);
        }
        // 아래처럼 하면 1,2,3,4,5,6 이렇게 한 줄로 출력됨. 바꾸려면 안에 for은 print, 바깥 for에는 println해주기.
        for(int[] row: matrix) {
            for(int number : row) {
                System.out.println(number);
            }
        }
    }
}
