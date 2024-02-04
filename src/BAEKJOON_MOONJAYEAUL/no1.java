package BAEKJOON_MOONJAYEAUL;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();

        int i = scan.nextInt();
        //charAt()을 사용하여 문자열의 특정 부분(여기선 i-1)을 출력해준다.
        System.out.println(S.charAt(i-1));
    }
}
