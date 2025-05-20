package PM.lecture16;

public class AccessModifier01 {
    public static void main(String[] args) {
        Student student = new Student("Lee", 20);
        // student.name = "Kim"; <- 컴파일 오류. private 선언
        student.setName("Jiho");
        student.age = 15;
        student.grade = "A+";
        student.school = "단국대";
    }
}
