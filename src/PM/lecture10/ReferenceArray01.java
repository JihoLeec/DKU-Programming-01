package PM.lecture10;

public class ReferenceArray01 {
    public static void main(String[] args) {
        String[] names = new String[4]; // String 자체가 참조형이므로 이거를 배열로 하면 곧 참조배열이다.
                                        // 각 요소들이 문자열의 주소. 참조 배열 종류 중 하나가 문자열 배열인 것
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Doe";
        System.out.println(names[3]); // null이 기본값임을 알 수 있다.
    }
}
