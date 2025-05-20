package PM.lecture16;

public class Enum01 {
    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;
        System.out.println(currentSeason);
        seasonExample();
    }
    
    public static void seasonExample() {
        Season now = Season.WINTER;
        
        switch (now) {
            case SPRING:
                System.out.println("봄");
                break; 
            case SUMMER:
                System.out.println("여름");
                break;
            case AUTUMN:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
        System.out.println(now.name()); // 열거 상수 -> 문자열
        System.out.println(now.ordinal()); // 열거 상수 순서 반환
        for(Season s: Season.values()) { // 모든 열거 상수를 배열로 반환
            System.out.println(s);
        }
    }
}
