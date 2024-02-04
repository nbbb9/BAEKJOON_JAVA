package BAEKJOON_MOONJAYEAUL;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        String str = scan.next();

        int count = 0;

        for(int i = 0; i < N; i++) {
            //charAt(0)은 해당 문자의 아스키코드값을 반환하므로 반드시 -48 또는 -'0'을 해주어야 입력받은 숫자값 그대로를 사용할 수 있다.
            count += str.charAt(i) - '0';
        }

        System.out.print(count);

    }
}
