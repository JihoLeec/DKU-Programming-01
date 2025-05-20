package PM.lecture15;

public class InstanceStatic02 {
    public static void main(String[] args) {
        double area = Calculator.calcCircleArea(5.0);
        System.out.println(area);

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        
        double area2 = calc1.calcCircleArea(3.0);
        System.out.println(area2);
        // 당연히 객체로 스태틱을 접근하는 것은 접근하는 것은 권장X
        // 클래스로 참조하라고 만들어놨더니 저러면 안되겠죠
    }
}
