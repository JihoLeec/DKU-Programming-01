package lecture4;

public class TypeCasting02 {
    public static void main(String[] args) {
        int small = 100;
        byte smallByte = (byte) small;
        System.out.println(smallByte);

        int big = 1000;
        byte bigByte = (byte) big;
        System.out.println(bigByte);

        double height = 175.5;
        int heightInt = (int) height;
        System.out.println(heightInt);

        int balance = Integer.MAX_VALUE;
        balance += 100;
        System.out.println(balance);

        byte byteVal = 10;
        short shortVal = (short) (byteVal*2);

    }
}
