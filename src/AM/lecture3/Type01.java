package AM.lecture3;

public class Type01 {
    public static void main(String[] args) {
        int number=90;
        double salary;
        char grade;
        boolean isActive=true;
        System.out.println(number);

        int source = number;
        number = 100;
        System.out.println("number 값: " + number + " source 값: " + source);
        System.out.println((char)65 +" "+ (char)'한');
        System.out.println(!isActive);
    }
}