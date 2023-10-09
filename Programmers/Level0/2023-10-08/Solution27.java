//가장 큰 수 찾기
public class Solution27 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int length = array.length;
        for(int i =0; i< length; i++) {
            if(answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    ///////////다른 사람의 풀이
    public int[] solution2(int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
