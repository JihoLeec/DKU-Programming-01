package PM.lecture12;

public class Function01 {
    public static void main(String[] args) {
        welcome(); // 메소드 호출
        int answer = doubleValue(5);
        // 호출 시 입력 값은 5는 매개변수라 부르면 안된다. 인자(= argument)라고 불러야 한다.
        System.out.println(answer);
        System.out.println(lol());
        System.out.println(getMax(3,5));
    }
    // 메소드의 기본 구조
    // [접근 제어자] [static] [반환타입] [이름][() <- 매개변수(= parameter)]
    // 메소드 선언
    public static void welcome() {
        System.out.println("Hello World!");
    }
    public static int doubleValue(int number) {
        return number * 2;
    }
    public static String lol() {
        return "ㅋㅋㅋ";
    }
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
