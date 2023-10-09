//콜라츠 추측
public class Solution33 {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        while(num != 1) {
            if(num%2 == 0) {
                num /=2;
                count++;
            } else{
                num = (num*3)+1;
                count++;
            }
        }
        answer = count;

        if(count > 500) {
            answer = -1;
        }

        return answer;
    }
}

///////////테스트 케이스 3번의 경우 계산 과정에서 값이 21억을 넘어서 오버플로우가 발생함
///////////매개변수 num을 int 형이 아닌 long으로 바꾸고 풀이 진행