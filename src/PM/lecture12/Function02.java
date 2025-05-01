package PM.lecture12;

public class Function02 {
    public static void main(String[] args) {
        int score=100;
        System.out.println(getGrade(score)+" "+score);
        // 인자 값과 매개변수 값은 다름. 값을 복사해서 전달하기 때문에 원본 값은 변경되지 않음
        String[] fruits = {"Apple", "Banana", "Orange", "Grape"};
        changeFruit(fruits);
        System.out.println(fruits[0]); // 이건 주소를 가져와서 거기 값을 바꿔 값 변경됨
    }
    public static String getGrade(int score) {
        score = 50;
        return "A";
    }
    public static void changeFruit(String[] items) {
        items[0] = "사과";
    }
}
