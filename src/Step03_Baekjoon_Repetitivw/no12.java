package Step03_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no12 {
    public static void main(String[] args) {
        //해당문제는 EOF의 개념이 중요하다.
        //입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        //hasNextInt는 입력값이 정수인 경우 true를 반환
        //정수가 아닌경우에는 바로 예외를 던지며 더이상의 입력을 받지 않고
        //false를 반환하면서 반복문이 종료된다.
        while(scan.hasNextInt()){
            //두개의 입력변수.
            int A = scan.nextInt();
            int B = scan.nextInt();

            System.out.println( A + B );

        }//while end

    }//main end
}//class end
