package Step1.BAEKJOON_IOandCalcu;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        //연도 입력
        int year = scanner.nextInt();
        //불기년도 = 543년 차이
        int bul = 543;
        //결과 출력
        System.out.println(year - bul);
    }//main end
}//class end