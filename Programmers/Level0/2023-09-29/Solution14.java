import java.util.Arrays;

//삼각형의 완성조건(1)
public class Solution14 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[2] < (sides[0]+sides[1])) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
