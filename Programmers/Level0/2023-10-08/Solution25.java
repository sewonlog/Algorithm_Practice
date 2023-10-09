import java.util.Arrays;

//중앙값 구하기
public class Solution25 {
    public int solution(int[] array) {
        int answer = 0;
        int count = array.length;
        int median = 0;
        Arrays.sort(array);
        median = (count / 2);
        answer = array[median];
        return answer;
    }
}
