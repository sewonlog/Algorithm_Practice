import java.util.Arrays;
import java.util.Objects;

//서울에서 김서방 찾기
public class Solution34 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i =0; i< seoul.length; i++) {
            if(Objects.equals(seoul[i], "Kim")) {
                answer = "김서방은 " + i+ "에 있다";
                break;
            }
        }
        return answer;
    }


    /////////다른 사람의 풀이
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ x + "에 있다";
    }

    public String findKim2(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = 0;

        for(String value:seoul) {
            if (value.equals("Kim")) break;
            x++;
        }

        return "김서방은 "+ x + "에 있다";
    }
}
