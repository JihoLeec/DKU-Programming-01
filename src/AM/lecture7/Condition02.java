package AM.lecture7;

public class Condition02 {
    public static void main(String[] args) {
        int age = 25,score = 70;

        if(age>=20) {
            if(score>60) {
                System.out.println("합격");
            } else if(score==60) {
                System.out.println("턱걸이");
            } else {
                System.out.println("불합격");
            }
        } else {
            System.out.println("나이 제한");
        }
    }
}
