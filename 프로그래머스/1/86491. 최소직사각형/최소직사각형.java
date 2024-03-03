class Solution {
        public int solution(int[][] sizes) {
        // 둘 중 더 긴 걸 가로로, 짧은 건 세로로
        int maxWidth = 1;
        int maxHeight = 1;

        for(int i = 0; i< sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            if(maxWidth < width) {
                maxWidth = width;
            }
            if(maxHeight < height) {
                maxHeight = height;
            }
        }
        return maxWidth * maxHeight;
    }
}