//가위바위보
public class Solution26 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        int length = rsp.length();
        for(int i =0; i<length; i++) {
            if(rsp.charAt(i) == '0') {
                answer.append('5');
            } else if(rsp.charAt(i) == '2') {
                answer.append('0');
            } else if(rsp.charAt(i) =='5') {
                answer.append('2');
            }
        }
        return answer.toString();
    }
}
