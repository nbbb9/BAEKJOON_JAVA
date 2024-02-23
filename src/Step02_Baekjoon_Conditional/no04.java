package Step02_Baekjoon_Conditional;

import java.util.Scanner;

public class no04 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //두 수를 입력받는 변수 A, B
        int A = sc.nextInt();
        int B = sc.nextInt();

        if( ((A > 1000 && A < -1000)&&(A!=0)) && ((B > 1000 && B < -1000)&&(B!=0)) ){
            //입력 제한
            System.out.println("숫자를 다시 입력하세요.");
        }else{
            if( A > 0 && B > 0){
                //1사분면
                System.out.println(1);
            }else if( A < 0 && B > 0){
                //2사분면
                System.out.println(2);
            }else if( A < 0 && B < 0){
                //3사분면
                System.out.println(3);
            } else if (A > 0 && B < 0) {
                //4사분면
                System.out.println(4);
            }//if-else2 end
        }//if-else end
    }//main end
}//class end
