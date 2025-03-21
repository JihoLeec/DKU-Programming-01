package lecture4;

public class TypeCasting01 {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;

        char charValue = 'A';
        intValue = charValue;

        float floatValue = intValue;
        double doubleValue = floatValue;

        int code = 65;
        char character = (char)code;
        System.out.println(character);

        char lower='a';
        char upper = (char)(lower - 32);
        System.out.println(upper);
    }
}
