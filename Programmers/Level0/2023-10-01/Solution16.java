//암호 해독
public class Solution16 {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 0; i<cipher.length(); i++) {
            if((i+1) % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }

    ////////////////다른 사람의 풀이
    public String solution2(String cipher, int code) {
        String answer = "";
        for(int i = code-1; i < cipher.length(); i+=code) answer += cipher.charAt(i);
        return answer;
    }
}
