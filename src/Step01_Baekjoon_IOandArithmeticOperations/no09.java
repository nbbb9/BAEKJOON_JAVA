package Step01_Baekjoon_IOandArithmeticOperations;

import java.util.Scanner;

public class no09 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //3개의 수를 입력받는 변수 A,B,C 생성
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        //각각의 결과 출력
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }//main end
}//class end
