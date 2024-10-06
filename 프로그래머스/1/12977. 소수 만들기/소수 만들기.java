class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;

        for(int i = 0; i< n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // sum이 소수인지 확인
                    if (isPrime(sum)) {
                        answer++;  // 소수이면 카운트 증가
                    }
                    
                }
            }
        }

        return answer;
    }


    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;  // 2보다 작은 수는 소수가 아님
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {  // 제곱근까지만 나누어 확인
            if (num % i == 0) {
                return false;  // 나누어 떨어지면 소수가 아님
            }
        }
        return true;  // 소수이면 true
    }
    
}