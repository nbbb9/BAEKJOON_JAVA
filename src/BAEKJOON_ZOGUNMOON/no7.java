package BAEKJOON_ZOGUNMOON;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //A,B,C는 각 주사위의 결과값을 저장하는 변수
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if( A < 0 || A > 6 || B < 0 || B > 6 || C < 0 || C > 6 ){
            //입력 제한
            System.out.println("주사위는 1~6까지만 입력가능합니다.");
        }else{
            if( (A == B) && (B == C) && (A == C)){
                //3개의 주사위가 모두 같은 경우
                System.out.println( 10000 + (A * 1000) );
            }else if( (A==B)&&(A!=C) ){
                //2개만 같은경우 1
                System.out.println( 1000 + (A*100) );
            } else if ( (A==C)&&(A!=B) ) {
                //2개만 같은경우 2
                System.out.println( 1000 + (A*100) );
            } else if ( (B==C)&&(B!=A) ) {
                //2개만 같은경우 3
                System.out.println( 1000 + (B*100) );
            } else{
                //3가지 모두 다른경우 우선 2가지를 비교한값을 num1에 저장하고
                //num1과 나머지 수를 비교한 값을 num2에 넣어 최댓값을 구한다.
                //삼항연산자 사용.
                int num1 = (A > B) ? A : B;
                int num2 = (num1 > C) ? num1 : C;
                //max메소드를 통해서 쉽게 최댓값을 구할 수 있다. max가 예약어라서 maxx로 변수명 설정.
                int maxx = Math.max(Math.max(A, B), C);
                System.out.println( maxx * 100 );
            }
        }

    }
}
