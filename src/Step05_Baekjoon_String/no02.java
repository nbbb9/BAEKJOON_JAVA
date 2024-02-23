package Step05_Baekjoon_String;

import java.util.Scanner;

public class no02 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //입력하는 단어를 저장하는 변수 str
        String str = scan.next();
        //단어의 길이를 계산하기 위한 변수 count
        int count = 0;
        //0부터 단어의 길이까지 반복하면서 count를 증가시킨다.
        for(int i = 0 ; i < str.length() ; i++) {
            count++;
        }//for end
        //count출력
        System.out.println(count);
    }//main end
}//class end
