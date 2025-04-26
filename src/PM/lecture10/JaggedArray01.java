package PM.lecture10;

public class JaggedArray01 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][]; // 가변 배열. 행마다 열 개수가 다르다.

        matrix[0] = new int[2];
        matrix[1] = new int[3];
        matrix[2] = new int[1];

        int[][] jagged = {
                {1,2},
                {3,4,5},
                {6}
        };
    }
}
