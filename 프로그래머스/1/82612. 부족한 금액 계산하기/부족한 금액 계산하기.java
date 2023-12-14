class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;

        for (int i = 1; i < count+1; i++) {
            totalPrice += price * i;
        }

        if (money < totalPrice) {
            return totalPrice-money;
        } else {
            return 0;
        }
    }
}