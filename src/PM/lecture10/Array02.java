package PM.lecture10;

public class Array02 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        
        // 메소드 영역
        // 스택 영역 -> 기본 타입, 참조 타입의 주소, 배열 변수     scores는 여기 저장. 배열의 시작 주소(idx=0)만 저장하는 것
        // 힙 영역 -> 참조 타입의 실제 데이터, 배열 자체     new int[5]는 여기 저장. 즉 참조타입

        int len = scores.length;    // 괄호를 붙이면 함수를 호출하겠다는 거임. 저건 읽기 전용변수라서 괄호 떼야함.
        
        int[] scores2 = {1,2,3,4,5}; // 초기화 방식1 이것을 제일 많이 사용한다. 그러나 this의 상황에서는 반드시 생성자를 붙여야한다.
        int[] scores3 = new int[] {1,2,3,4,5}; // 초기화 방식2
        int[] scores4;
        //scores4 = {1,2,3,4,5}; // this: 컴파일 에러 발생. scores2처럼 최초 선언시에만 JAVA 내부에서 new int[] 처리를 해준다.
    }
}
