//최댓값 만들기(2)

import java.util.Arrays;

public class Solution19 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int num1 = numbers[numbers.length -1] * numbers[numbers.length -2];
        int num2 = numbers[0] * numbers[1];

        if(num1 > num2) {
            answer = num1;
        } else {
            answer = num2;
        }
        return answer;
    }
}
