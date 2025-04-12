package lecture9;

public class String01 {
    public static void main(String[] args) {
        String name1 = "단국대";
        String name2 = new String("소프트웨어학과");
        String name3 = "Lee";

        System.out.println(name1+" "+name2); // + 연산자로 문자열 연결
        System.out.println(name1.length()+" "+name2.length()); // 길이 반환 메소드
        System.out.println(name1.charAt(0)+" "+name2.charAt(0)); // 위치에 따른 요소 반환 메소드
        System.out.println(name1.substring(0,2)+" "+name2.substring(5,7)); // 부분 문자열 추출. 주의: 뒤는 범위 포함X(까지)
        System.out.println(name1.contains("국")); // 포함하니? -> true, boolean 반환
        System.out.println(name1.replace("단국", "하버드")); // 문자열 바꾸기
        System.out.println(name3.toUpperCase());
    }
}
