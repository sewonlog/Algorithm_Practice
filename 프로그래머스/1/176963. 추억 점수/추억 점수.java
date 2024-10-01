import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
                int[] answer = new int[photo.length];

        HashMap<String, Integer> numberMap = new HashMap<>();

        for(int i = 0; i< name.length; i++) {
            numberMap.put(name[i], yearning[i]);
        }


        for(int i = 0; i< photo.length; i++) {
            for(int j = 0; j<photo[i].length; j++) {
                if(numberMap.containsKey(photo[i][j])) {
                    answer[i] += numberMap.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}