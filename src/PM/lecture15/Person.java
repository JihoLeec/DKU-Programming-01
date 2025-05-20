package PM.lecture15;

public class Person {
    final String nation = "Korea";  // 힙에 존재하는 상수
    final String ssn;   // 반드시 초기화 해줘야함. 이렇게 생성자로 초기화 해줘도 됨, 초기화 후 불변 값

    public static final String WHAT_IS_THIS = "Human"; // 메소드 영역에 존재하는 클래스 상수

    String name;

    Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
