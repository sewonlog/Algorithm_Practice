import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        int total = Integer.parseInt(inputArr[0]);
        int count = Integer.parseInt(inputArr[1]);

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i< count; i++) {

            String number = br.readLine();
            int spaceIndex = number.indexOf(" ");
            int cash = Integer.parseInt(number.substring(spaceIndex+1));

            if(number.startsWith("d")) {
                total += cash;
            } else if (number.startsWith("r")) {
                if(cash > total || !queue.isEmpty()) {
                    queue.add(cash);
                } else {
                    total -= cash;
                }
            } else if(number.startsWith("p")) {
                if(cash <= total) {
                    total -= cash;
                }
            }

            if(!queue.isEmpty()) {
                while (!queue.isEmpty()) {
                    int value = queue.poll();
                    if(total >= value) {
                        total -= value;
                    }
                }
            }
        }

        System.out.println(total);
    }
}
