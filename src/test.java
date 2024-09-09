import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class test {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String timeInput = br.readLine();

        String busInput = br.readLine();
        String[] busArray = busInput.split(" ");

        String[] timeSplit = timeInput.split(":");

        int[] timeArr = new int[2];
        for(int i = 0; i< 2; i++) {
            timeArr[i] = Integer.parseInt(timeSplit[i]);
        }

        int nowTime = timeArr[0]*60 + timeArr[1];

        int[] busTimeArr = new int[5];
        for(int i = 0; i< 5; i++) {
            busTimeArr[i] = (Integer.parseInt(busArray[i].substring(0,2)) * 60) + Integer.parseInt(busArray[i].substring(3,5));
        }

        Arrays.sort(busTimeArr);

        for(int i = 0; i< 5; i++) {
            if(busTimeArr[i] > nowTime) {
                answer = busTimeArr[i] - nowTime;
                break;
            }
        }

        System.out.println(answer);
    }
}
