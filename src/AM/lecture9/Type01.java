package AM.lecture9;

public class Type01 {
    public static void main(String[] args) {
        int n1=10,n2=20;
        System.out.println(n1==n2);

        String str1 = "안녕"; // 문자열 리터럴로 생성
        String str2 = "안녕"; // 문자열 리터럴로 생성

        String str3 = new String("안녕");
        String str4 = new String("안녕");

        System.out.println(str1==str2); //true; 리터럴로 생성. 이때는 값이 같기에 같은 주소를 가르킴 
                                        //스택 영역에서는 다른 객체이나 힙에서는 같은 문자열을 가르킴
        System.out.println(str1.equals(str2)); //true;  값이 안녕으로 같음.
        System.out.println(str3==str4); //false;    주소가 다르기 때문임
        System.out.println(str3.equals(str4)); //true; 값이 안녕으로 같음

    }
}
