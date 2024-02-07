package Step2.BAEKJOON_Conditional;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args){
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //두 수 A, B를 입력받는다.
        int A = sc.nextInt();
        int B = sc.nextInt();
        //두 수를 크기비교해서, 각 조건에 맞는 로직을 실행한다.
        if( A > B ){
            System.out.println(">");
        }else if( A == B ){
            System.out.println("==");
        }else if( A < B ){
            System.out.println("<");
        }
    }
}
