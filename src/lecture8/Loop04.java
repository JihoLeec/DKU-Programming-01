package lecture8;

public class Loop04 {
    public static void main(String[] args) {
        int i=0;
        for (;i<100;i++) {
            if(i==5)continue;
            if(i==10)break;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
