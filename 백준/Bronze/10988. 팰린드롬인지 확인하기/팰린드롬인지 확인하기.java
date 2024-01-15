import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;

        // 공백을 제거하고 대소문자를 구분하지 않기 위해 소문자로 변환
        String cleanInput = input.replaceAll("\\s", "").toLowerCase();

        // 문자열을 거꾸로 만들어 비교
        String reversedInput = new StringBuilder(cleanInput).reverse().toString();

        if(cleanInput.equals(reversedInput)) {
            result = 1;
        }

        System.out.print(result);
    }
}