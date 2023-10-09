//짝수는 싫어요
import java.util.stream.IntStream;

public class Solution24 {
    public int[] solution(int n) {
        int count = 0;
        for(int i = 1; i<=n;i++) {
            if(i%2 ==1) {
                count++;
            }
        }

        int[] answer = new int[count];

        int j = 0;
        for(int i = 1; i<=n;i++) {
            if(i%2 ==1) {
                answer[j] = i;
                j++;
            }
        }

        return answer;
    }



    ///////////다른 사람의 풀이
    public int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
