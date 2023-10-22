//수박수박수박수박수박수?
public class Solution46 {
    public String solution(int n) {
        String answer = "";
        if(n%2 == 0) {
            int s = n/2;
            for(int i = 0; i<s; i++) {
                answer += "수박";
            }
        } else {
            int s = (n-1)/2;
            for(int i = 0; i<s; i++) {
                answer += "수박";
            }
            answer += "수";
        }
        return answer;
    }
}
