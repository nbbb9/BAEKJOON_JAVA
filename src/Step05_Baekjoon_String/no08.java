package Step05_Baekjoon_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class no08 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //사용자가 입력하는 문자열을 저장하는 변수 str
        String str = scan.nextLine();

        //StringTokenizer에 대해서 학습 필요.
        //긴 문자열을 지정된 구분자(delim)를 기준으로 토큰이라는 여러개의 문자열로 잘라내는데 사용된다.
        StringTokenizer st = new StringTokenizer(str," ");
        //countTokens를 이용해서 토큰의 개수를 출력한다.
        System.out.println(st.countTokens());

    }//main end
}//class end
