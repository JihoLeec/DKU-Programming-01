package AM.lecture7;

public class Condition01 {
    public static void main(String[] args) {
        /**
         * if(조건식) {
         *     어쩌고저쩌고
         * }
         */
        int number=7;

        if(number%2!=0) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }

        int age = 68;
        boolean isStudent = false;
        boolean isVeteran = true;

        if (isStudent || age >= 65 || isVeteran) {
            System.out.println("할인 대상입니다.");
        }
        // 놀라운 사실: c처럼 int 값을 자동으로 boolean으로 변환해주지 않는다.
    }
}
