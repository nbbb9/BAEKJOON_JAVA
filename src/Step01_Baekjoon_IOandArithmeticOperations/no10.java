package Step01_Baekjoon_IOandArithmeticOperations;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //숫자를 입력받는 두개의 변수 A, B
        int A = sc.nextInt();
        int B = sc.nextInt();
        //B의 100의자리, 10의자리, 1의자리를 구하고 저장하는 변수 3개 선언.
        int B_1 = B / 100;
        int B_2 = (B % 100) / 10;
        int B_3 = (B % 100) % 10;
        //A와 B의 각 자리수를 곱한 결과값을 순차적으로 저장.
        int c1 = A * B_3;
        int c2 = A * B_2;
        int c3 = A * B_1;
        int c4 = A * B;
        //결과값 출력
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }//main end
}//class end
