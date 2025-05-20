package PM.lecture16;

public class Student {

    private String name;
    int age;
    protected String grade;
    public String school;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
