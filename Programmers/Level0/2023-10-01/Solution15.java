//첫 번째로 나오는 음수
public class Solution15 {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = -1;
        for(int i = 0; i< num_list.length; i++) {
            if(num_list[i] < 0) {
                num = i;
            }
            if(num > -1) {
                break;
            }
        }
        answer = num;
        return answer;
    }
}
