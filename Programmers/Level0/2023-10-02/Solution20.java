//직각삼각형 출력하기
import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //System.out.println(n);
    }
}
