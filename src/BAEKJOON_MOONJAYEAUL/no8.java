package BAEKJOON_MOONJAYEAUL;

import java.util.Scanner;
import java.util.StringTokenizer;

public class no8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //StringTokenizer에 대해서 학습 필요.
        //긴 문자열을 지정된 구분자(delim)를 기준으로 토큰이라는 여러개의 문자열로 잘라내는데 사용된다.
        StringTokenizer st = new StringTokenizer(str," ");

        System.out.println(st.countTokens());

    }//main end
}//class end
