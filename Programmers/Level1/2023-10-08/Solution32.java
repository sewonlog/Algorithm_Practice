//정수 제곱근 판별
public class Solution32 {
    public long solution(long n) {
        long answer = -1;
        for(long i = 0; i<=n; i++) {
            if(i*i ==n) {
                answer = (i + 1) * (i+1);
                break;
            }
        }
        return answer;
    }

    //////////다른 사람의 풀이
    public long solution2(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }

    public long solution3(long n) {
        long answer = 0;

        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
            else answer = -1;
        }
        return answer;
    }
}
