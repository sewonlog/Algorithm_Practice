//같은 숫자는 싫어
import java.util.ArrayList;

public class Solution47 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int num = -1;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
