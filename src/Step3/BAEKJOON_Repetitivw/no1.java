package Step3.BAEKJOON_Repetitivw;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //입력값 저장 변수
        int n = sc.nextInt();

        if( n < 1 || n > 9){
            //입력값 제한
            System.out.println("1~9까지만 입력하세요");
        }else{
            for(int i = 1 ; i <= 9 ; ++i ){
                //i를 1부터 9까지 1씩 증가시킨다.
                //for문이 1회 실행되고 나면, 1증가되고 조건식 실행
                int result = n * i;
                System.out.println( n + " * " + i + " = " + result );
            }
        }

    }
}






