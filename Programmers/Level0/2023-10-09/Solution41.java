//특별한 이차원 배열 2
public class Solution41 {
    public int solution(int[][] arr) {
        int answer = 0;
        int n = arr.length;
        boolean result = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] != arr[j][i]) {
                    result = false;
                }
            }
        }
        if(result) {
            answer = 1;
        }
        return answer;
    }
}
