package AM.lecture6;

public class ShiftOp {
    public static void main(String[] args) {
        int a=8;

        int leftShift = a<<2; // 100000 곱셈임.
        int rightShift = a>>2; // 100001000 -> 1110000010 나눗셈임.
        int rightShift2 = a>>>2;
        System.out.println(a);
        System.out.println(leftShift);
        System.out.println(rightShift);
        System.out.println(rightShift2);
    }
}
