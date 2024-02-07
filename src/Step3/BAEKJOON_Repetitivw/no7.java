package Step3.BAEKJOON_Repetitivw;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //테스트 케이스의 개수 저장 변수
        int T = sc.nextInt();
        //A, B 두개의 정수를 받을 변수.
        int A, B;
        //입력받을 정수값들의 합을 저장할 배열 선언
        int[] intarray = new int[T];

        for(int i = 0 ; i < T ; i++) {
            //A, B 두개의 정수를 받을 변수. 입력받은 테스트 케이스 만큼 A, B를 입력받는다.
            A = sc.nextInt();
            B = sc.nextInt();
            //배열의 0번 인덱스부터 N번까지 A + B의 값 대입
            intarray[i] = A + B;

            if( A <= 0 || B >= 10  ){
                //A, B의 입력 제한조건
                System.out.println("두 수를 다시 입력하세요.");
            }//if end

        }//for end

        for(int i = 0 ; i < T ; i++){
            //배열의 0번 인덱스부터 N번까지 A + B의 값 대입
            System.out.println("Case #" + (i+1) + ": " + intarray[i]);
        }//for end

    }//main end
}//class end