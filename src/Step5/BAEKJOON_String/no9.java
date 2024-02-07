package Step5.BAEKJOON_String;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //사용자가 입력하는 두개의 문자열을 입력받는 변수 A, B
        String A = scan.next();
        String B = scan.next();
        //A와 B를 첫번째와 마지막 문자의 순서를 바꾼것을 저장하는 변수 reverseA, reverseB
        String reverseA = Character.toString(A.charAt(2)) + Character.toString(A.charAt(1)) + Character.toString(A.charAt(0));
        String reverseB = Character.toString(B.charAt(2)) + Character.toString(B.charAt(1)) + Character.toString(B.charAt(0));
        //reverseA와 reverseB를 숫자로 바꾸고(parseInt) 크기를 비교한다.
        //각 조건에 맞는 결과를 실행한다.
        if(Integer.parseInt(reverseA)>Integer.parseInt(reverseB)) {
            System.out.println(reverseA);
        }else {
            System.out.println(reverseB);
        }//else end

    }//end main
}//end class
