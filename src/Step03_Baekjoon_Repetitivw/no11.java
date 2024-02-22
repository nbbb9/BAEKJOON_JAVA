package Step03_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        //무한루프를 위해 while문 안에 true를 사용한다.
        while(true){
            //두개의 입력변수를 선언한다.
            int A = scan.nextInt();
            int B = scan.nextInt();
            //A와 B가 둘다 0이라면 시스템을 종료한다.
            if( A == 0 && B == 0 ){
                System.exit(0);
            }//if end
            //if문에 해당하지 않으면 A+B를 출력한다.
            System.out.println(A + B);

        }//while end

    }//main end
}//class end