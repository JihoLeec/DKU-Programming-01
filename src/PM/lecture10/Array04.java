package PM.lecture10;

public class Array04 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4]; // 3행 4열 배열

        matrix[0][0] = 1;
        matrix[1][1] = 2;

        System.out.println(matrix.length); // 행 길이
        System.out.println(matrix[0].length); //열 길이

        int [][] matrix2 = {    // 2차원 배열 값 할당 방법, 구조 파악 쉬움
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
