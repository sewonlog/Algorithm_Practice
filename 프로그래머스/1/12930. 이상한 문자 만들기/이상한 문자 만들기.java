class Solution {
        public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] list = s.split("");

        int count = 0;
        for(int i = 0; i< list.length; i++) {
            if(list[i].equals(" ")) {
                count = 0;
            } else if(count % 2 == 0 ) {
                list[i] = list[i].toUpperCase();
                count++;
            } else {
                list[i] = list[i].toLowerCase();
                count++;
            }
            answer.append(list[i]);

        }

        return answer.toString();
    }
}