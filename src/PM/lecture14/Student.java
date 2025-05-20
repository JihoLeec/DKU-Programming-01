package PM.lecture14;

public class Student {
    String name;
    int id;
    int age = 20;
    String major = "소프트웨어학";    // 너무 강력한 초기화 방식이라 생성자가 아닌 필드 초기화는 권장하지 않음
    double gpa;

    public Student() {
        System.out.println("입학");
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("입학");
    }
}
