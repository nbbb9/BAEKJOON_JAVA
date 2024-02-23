package Step03_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no08 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //테스트 케이스의 개수 저장 변수 T
        int T = sc.nextInt();
        //두개의 입력값을 받을 변수 2가지 선언
        int A, B;
        //입력받을 정수값들의 합을 저장할 배열 선언
        int[] intarray = new int[T];
        //A와 B를 저장할 배열 선언
        int[] A_array = new int[T];
        int[] B_array = new int[T];

        for(int i = 0 ; i < T ; i++) {
            //A, B 두개의 정수를 받을 변수. 입력받은 테스트 케이스 만큼 A, B를 입력받는다.
            A = sc.nextInt();
            B = sc.nextInt();
            //배열의 0번 인덱스부터 N번까지 A + B의 값 대입
            int C = A + B;
            intarray[i] = C;
            A_array[i] = A;
            B_array[i] = B;

            if( (A < 0 || A > 10) || (B < 0 || B > 10) ){
                //A, B의 입력 제한조건
                System.out.println("두 수를 다시 입력하세요.");
            }//if end

        }//for end

        for(int i = 0 ; i < T ; i++){
            //배열의 0번 인덱스부터 N번까지 A + B의 값 대입
            System.out.println("Case #" + (i+1) + ": " + A_array[i] + " + " + B_array[i] + " = " + intarray[i] );
        }//for end

    }//main end
}//class end
