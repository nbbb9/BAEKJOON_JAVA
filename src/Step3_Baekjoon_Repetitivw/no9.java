package Step3_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //별을 찍을 줄을 입력을 저장하는 변수
        int N = sc.nextInt();

        if( N < 1 || N > 100 ){
            //입력값 제한
            System.out.println("1부터 100사이의 수를 입력하세요.");
        }//if end
        //이중for문을 사용하는 문제.
        // for문안에 for문을 두어서 각 차수(?)마다 그만큼의 별을 출력하고
        //끝나면 줄바꿈을 실행하도록 한다.
        for(int i = 1 ; i <= N ; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print("*");
            }//for2 end
            System.out.print('\n');
        }//for end

    }//main end
}//class end
