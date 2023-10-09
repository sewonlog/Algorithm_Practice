//이어 붙인 수
public class Solution38 {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNum = "";
        String evenNum = "";
        for(int i =0; i< num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
                oddNum += num_list[i];
            } else {
                evenNum += num_list[i];
            }
        }
        answer = Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
        return answer;
    }
}
