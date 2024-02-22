package Step5_Baekjoon_String;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //입력할 숫자의 갯수를 입력받는 변수 N
        int N = scan.nextInt();
        //입력할 문자열을 입력받는 변수 str
        String str = scan.next();
        //입력한 숫자의 총 합을 구하기위한 변수 count
        int count = 0;

        for(int i = 0; i < N; i++) {
            //charAt(0)은 해당 문자의 아스키코드값을 반환하므로 반드시
            // -48 또는 -'0'을 해주어야 입력받은 숫자값 그대로를 사용할 수 있다.
            count += str.charAt(i) - '0';
        }//for end
        //count 출력
        System.out.print(count);

    }//main end
}//class end
