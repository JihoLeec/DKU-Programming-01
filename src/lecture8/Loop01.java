package lecture8;

public class Loop01 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
        
        for (;;) System.out.println("hello World"); // 무한루프. 항상 참이기에
    }
}
