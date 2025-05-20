package PM.lecture14;

public class Person {
    String name;

    public void SetName(String name) {
        this.name = name;
        // 필드 = 매개변수
    }
    public void Test() {
        this.SetName("John");
        // 메소드도 호출할 수 있다.
        // this를 떼도 상관이 없는데 이 메소드가 이 클래스에 있다는 것을 확실히 알려주기 위해 권장됨
    }
    public Person add(int x) {
        this.name = "ㅋㅋㅋ";
        return this;
        // 반황형이 Person임. Line 17의 의미는 이 객체를 반환하라 라는 뜻.
    }

    public Person multiply(int x) {
        this.name="zz";
        return this;
    }
}
