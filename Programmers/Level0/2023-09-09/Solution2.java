//더 크게 합치기
class Solution2 {
    public int solution(int a, int b) {
        int answer = 0;

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        String hap1 = str1 + str2;
        String hap2 = str2 + str1;

        int result1 = Integer.parseInt(hap1);
        int result2 = Integer.parseInt(hap2);

        if(result1 > result2) {
            answer = result1;
        } else if (result1 < result2) {
            answer = result2;
        } else {
            answer = result1;
        }

        return answer;
    }
}