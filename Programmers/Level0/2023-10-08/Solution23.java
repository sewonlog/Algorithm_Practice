//세균 증식

public class Solution23 {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i = 1; i<= t; i++) {
            n = n*2;
        }
        answer = n;
        return answer;
    }
}