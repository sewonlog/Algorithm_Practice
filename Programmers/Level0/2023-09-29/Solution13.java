//양꼬치
public class Solution13 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n*12000) + (k*2000);
        int num = n/10;
        answer = answer - (2000*num);
        return answer;
    }
}
