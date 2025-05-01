package PM.lecture12;

public class Overloading01 {
    public static void main(String[] args) {
        System.out.println(add(1.0,2.0));
        System.out.println(add(2,3));
        // 자바가 알아서 인자를 판단해 알맞은 메소드를 호출해줌 
        // println도 메서드 오버로딩 덕분에 우리가 막 집어넣어 쓸 수 있던 것
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {// 매개변수가 int a,int b면 구분을 못함. 컴파일러가 매개변수로 구분함
        return a + b;
    }
    // 두 개 함수가 이름이 똑같은데 컴파일 오류가 나지 않음
}
