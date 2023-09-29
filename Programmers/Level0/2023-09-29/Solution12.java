//짝수 홀수 개수
public class Solution12 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int first = 0;
        int second = 0;

        for(int i = 0; i< num_list.length; i++) {
            if(num_list[i]%2 == 0) {
                first++;
            } else {
                second++;
            }
        }
        answer[0] = first;
        answer[1] = second;
        return answer;
    }
}
