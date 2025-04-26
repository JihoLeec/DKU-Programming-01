package AM.lecture9;

public class Type02 {
    public static void main(String[] args) {
        String str = null;
        String empty = "";

        if(str!=null) { // NullPointerException을 방지하기 위한 예외처리 저건 매우 치명적인 오류
            System.out.println(str);
        } else {
            System.out.println("empty");
        }
    }
}
