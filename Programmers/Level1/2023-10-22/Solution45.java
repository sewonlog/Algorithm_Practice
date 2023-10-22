//가운데 글자 가져오기
public class Solution45 {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split("");

        if(list.length%2 == 1){
            int i = (list.length-1) / 2;
            answer = list[i];
        } else {
            int i = (list.length /2)-1;
            answer += list[i];
            answer += list[i+1];
        }
        return answer;
    }
}
