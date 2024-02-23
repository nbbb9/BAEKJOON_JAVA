package Step05_Baekjoon_String;

import java.util.Scanner;

public class no01 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //입력하는 단어를 저장하는 변수 S
        String S = scan.next();
        //입력하는 정수를 저장하는 변수 i
        int i = scan.nextInt();
        //charAt()을 사용하여 문자열의 특정 부분(여기선 i-1)을 출력해준다.
        System.out.println(S.charAt(i-1));
    }//main end
}//class end
