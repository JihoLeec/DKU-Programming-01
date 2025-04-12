package lecture8;

public class Loop05 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"X"+j+"="+(i*j));
            }
        }
        for (int i=5;i>0;i--) {
            for (int j=i;j>0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
