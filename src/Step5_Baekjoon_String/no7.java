package Step5_Baekjoon_String;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //테스트 케이스 입력 저장 변수
        int T = scan.nextInt();
        //테스트 케이스만큼 반복
        for (int i = 0; i < T; i++) {
            //반복을 수행할 횟수를 입력받는 변수 R
            int R = scan.nextInt();
            //반복을 수행할 문자열을 입력받는 변수 S
            //nextLine()을 쓰면 공백까지 입력받으므로 X
            String S = scan.next();
            //toCharArray는 String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
            //char형 변수를 선언해서 S의 각 문자를 char로 변환해 저장.
            //char [] chars = S.toCharArray();
            //첫번째 for문은 입력된 문자열의 길이만큼 반복을 수행한다.(각 문자별로 입력된 횟수만큼 반복해야하므로)
            for (int j = 0; j < S.length(); j++) {
                //두번째 for문에서 입력된 반복 횟수만큼 하나의 문자를 출력한다.
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }//for3 end
            }//for2 end
            //한 번의 문자열을 출력한 후 줄바꿈 수행.
            System.out.println();
        }//for1 end

    }//main end
}//class end
