//없는 숫자 더하기
public class Solution44 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i : numbers) {
            answer -= i;
        }
        return answer;
    }
}
