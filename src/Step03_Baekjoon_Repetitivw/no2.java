package Step03_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //테스트 케이스의 개수 저장 변수
        int N = sc.nextInt();
        //입력받을 정수값들의 합을 저장할 배열 선언
        int[] intarray = new int[N];

        for(int i = 0 ; i < N ; ++i){
            //A,B 두가지를 N번만큼 입력받기 위해 for문 안에 scan을 사용한다.
            int A = sc.nextInt();
            int B = sc.nextInt();
            //배열의 0번 인덱스부터 N번까지 A + B의 값 대입
            intarray[i] = A + B;
        }
        for(int i = 0 ; i < N ; i++){
            //결과값을 0번 인덱스부터 출력
            System.out.println(intarray[i]);
        }

    }
}
