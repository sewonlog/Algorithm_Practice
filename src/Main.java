import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        test3(num);
    }

    public static void test1(int num) {
        for(int i = 0; i< num; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void test2(int num) {
        for(int i = 1; i<= num; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void test3(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void test4(int num) {

    }

}
