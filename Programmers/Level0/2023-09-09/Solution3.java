//두 수의 연산값 비교하기
public class Solution3 {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        int result1 = Integer.parseInt(str1+str2);
        int result2 = 2*a*b;

        if(result1 < result2) {
            answer = result2;
        } else {
            answer = result1;
        }

        return answer;
    }
}
