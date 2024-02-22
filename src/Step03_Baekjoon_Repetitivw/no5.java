package Step03_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //입력값을 저장할 변수
        int N = sc.nextInt();
        //N은 4의 몇배수인지 계산하고 저장하는 변수
        int N_4 = N/4;

        if( ((N % 4) != 0) || (N < 4 || N > 1000) ){
            //입력값 제한
            System.out.println("N은 4의 배수로만 입력할 수 있습니다.");
        }else{
            for(int i=1 ; i <= N_4 ; ++i){
                //입력값을 4로 나눈값 만큼 long 출력.
                System.out.print("long" + " ");
            }//for end
        }//if end

        //입력한 수의 배수만큼 long을 출력하고 나면 마지막으로 long int를 출력함.
        System.out.println("int");

    }//main end
}//class end
