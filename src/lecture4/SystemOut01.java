package lecture4;

public class SystemOut01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello World!\t");
        System.out.printf("출력: %d\n",100);;

        int value1 = 100;
        int value2 = 200;
        float value3 = 300.231412f;
        System.out.printf("형식 %.3f \t%02d\n",value3,value2);
    }
}