import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split(" ");

        int piece = Integer.parseInt(inputArr[0]);
        int interval = Integer.parseInt(inputArr[1]);

        Set<Integer> pizza = new HashSet<>();
        int count = 0;

        while (count <= piece) {
            for(int i = 1; i<= piece; i+= interval) {
                pizza.add(i);
                count++;
            }
        }
        List<Integer> allNumber = new ArrayList<>();

        for(int i = 1; i<= piece; i++) {
            allNumber.add(i);
        }

        allNumber.removeAll(pizza);

        for(int i = 0; i< allNumber.size(); i++) {
            System.out.print(allNumber.get(i) + " ");
        }
    }
}
