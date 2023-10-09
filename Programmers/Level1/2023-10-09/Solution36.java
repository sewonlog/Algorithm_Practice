//핸드폰 번호 가리기
public class Solution36 {
    public String solution(String phone_number) {
        String[] str = phone_number.split("");
        for(int i = 0; i < str.length-4; i++) {
            str[i] = "*";
        }
        return String.join("", str);
    }
}
