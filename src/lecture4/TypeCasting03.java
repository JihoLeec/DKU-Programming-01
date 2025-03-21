package lecture4;
// lecture 5 때 복습

public class TypeCasting03 {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        
        int largerValue = 300;
        byte smallerValue = (byte) largerValue;
        
        int num1 = 10;
        double num2 = 5.5;
        double result = num1 + num2;
        System.out.println(result);

        byte value1 = 10;
        byte value2 = 20;
        // byte result2 = value1 + value2;
        // 자동 형 변환은 자기보다 작은거에 넣을 수 없다.
        // 산술 연산은 int로 변환이 돼서 byte에 담을 수 없는 듯
        int result1 = value1 + value2;
        System.out.println(result1);

        int value3 = 10;
        float floatValue = 2.5f;
        float result3 = value3 + floatValue; // int는 float, double로 자동 변환
        System.out.println(result3);
    }
}
