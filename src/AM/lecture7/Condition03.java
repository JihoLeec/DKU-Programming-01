package AM.lecture7;

public class Condition03 {
    public static void main(String[] args) {
        int day=3,value=1;

        switch (day) { // 주의: break 안걸면 case문이 중첩 실행됨. 이걸 의도할 수도 있음.
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default: //if문의 else와 똑같음. 그래서 없어도 됨.
                System.out.println("No day");
        }
        switch (value) {
            case 1 -> {
                System.out.println("Monday");
                // 이런 식으로 업데이트 됐음. 그만큼 중괄호가 중요하다. 생략말자. break 생략가능
            }
            case 2 -> {
                System.out.println("Tuesday");
            }
        }
    }
}
