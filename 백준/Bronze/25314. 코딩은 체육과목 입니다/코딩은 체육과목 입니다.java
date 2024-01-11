import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = n/4;
        for(int j = 0; j<i; j++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}