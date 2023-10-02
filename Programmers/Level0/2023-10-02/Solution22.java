import java.util.Arrays;

//문자열 정렬하기(1)
public class Solution22 {
    public int[] solution(String my_string) {
        char[] array = my_string.toCharArray();

        int count = 0;
        String str = "";
        for(int i = 0; i< array.length; i++) {
            if(array[i] >= 48 && array[i] <= 57) {
                count++;
            }
        }

        int[] answer = new int[count];
        int j = 0;
        for(int i = 0; i< array.length; i++) {
            if(array[i] >= 48 && array[i] <= 57) {
                answer[j] = Character.getNumericValue(array[i]);
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
