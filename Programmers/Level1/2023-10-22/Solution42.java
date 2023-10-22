//정수 내림차순으로 배치하기
import java.util.Arrays;

public class Solution42 {
    public long solution(long n) {
        long answer = 0;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String alist : list) {
            sb.append(alist);
        }

        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}
