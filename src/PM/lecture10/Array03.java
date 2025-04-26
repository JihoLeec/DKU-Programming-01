package PM.lecture10;

public class Array03 {
    public static void main(String[] args) {
        int[] scores = new int[] {85,90,75,95,80};
        int len=scores.length,max=0,min=100,sum=0;
        for(int i=0;i<len;i++) {
            sum+=scores[i];

            if(scores[i]>max) {
                max = scores[i];
            } else if(scores[i]<min) {
                min = scores[i];
            }
        }
        System.out.println("Max: "+max+" Min: "+min+" Avg: "+(double)(sum/len));

        // 평균같은거 구할 때 나누는 값으로 그냥 5 이렇게 숫자 때려박으면 하드코딩이라 해서 매우 안좋은 버릇
    }
}
