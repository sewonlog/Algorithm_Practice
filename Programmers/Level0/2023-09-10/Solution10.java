import java.util.Arrays;

//배열의 평균값
public class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int i = 0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double)sum / numbers.length;
        return answer;
    }


    ////////다른사람의 풀이
    public double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}



