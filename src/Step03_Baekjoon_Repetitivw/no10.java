package Step03_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //별을 찍을 줄을 입력을 저장하는 변수 N
        int N = sc.nextInt();
        //이중for문을 사용한다.
        for(int i = 1; i <= N ; i++){
            for(int j = 0 ; j < (N-i) ; j++){
                //입력값에서 1을 뺀만큼 빈칸을 생성한다.
                System.out.print(" ");
            }//for2 end
            for(int z = 0 ; z < i ; z++){
                //i만큼 별을 출력한다.
                System.out.print("*");
            }//for3 end
            //한번의 프로세스가 끝나면 줄바꿈을 수행한다.
            System.out.print('\n');
        }//for end

    }//main end
}//class end
