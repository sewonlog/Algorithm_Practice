import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int[] arr) {

        //배열 길이가 1인 경우
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        List<Integer> intList = new ArrayList<>();
        for(int num : arr) {
            intList.add(num);
            if(min > num) {
                min = num;
            }
        }

        intList.remove(Integer.valueOf(min));

        for(int i = 0; i<intList.size(); i++) {
            answer[i] += intList.get(i);
        }

        return answer;

    }
}