package PM.lecture10;

public class Array01 {
    public static void main(String[] args) {
        int[] scores;           // 배열 선언
        scores = new int[5];    // 배열 객체 생성, 길이 고정
        for(int i=0;i<scores.length;i++)  // 전부 0출력, 초기값 지정됨
            System.out.println(scores[i]);

        boolean[] bools = new boolean[10];
        double[] doubles = new double[10];
        char[] chars = new char[10];
        System.out.println(bools[0]);
        System.out.println(doubles[0]);
        System.out.println(chars[0]);
    }
}
