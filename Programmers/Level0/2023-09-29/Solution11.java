//문자열 안에 문자열
public class Solution11 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
