package lecture8;

public class Loop02 {
    public static void main(String[] args) {
        int i = 1, sum=0;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++; // 얘를 까먹으면 무한루프에 빠짐 조건이 항상 참이기에
        }
        i=1;
        while(i<=100) {
            sum+=i;i++;
        }
        System.out.println("sum = " + sum);
//        while (true) {
//
//        } 무한루프
    }
}
