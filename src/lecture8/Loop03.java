package lecture8;

public class Loop03 {
    public static void main(String[] args) {
        int i=1,sum=0;
        do {
            System.out.println("Hello World");
            i++;
        } while (i>5);
        // 조건 맞지도 않는데 한 번은 반드시 실행해줌. while이 뒤에 있어서 그런듯
        i--;
        do{
            sum+=i;
            i++;
        } while(i<=100);
        System.out.println(sum);
    }
}
