//개미 군단
public class Solution8 {
    public int solution(int hp) {
        //5,3,1
        int answer = 0;

        answer += hp/5;
        hp %= 5;

        answer += hp/3;
        hp %= 3;

        answer += hp/1;

        return answer;
    }
}
