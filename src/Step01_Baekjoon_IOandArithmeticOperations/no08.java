package Step01_Baekjoon_IOandArithmeticOperations;

import java.util.Scanner;

public class no08 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        //입력받는 연도를 저장하는 변수
        int year = scanner.nextInt();
        //불기년도 = 543년 차이
        int bul = 543;
        //결과 출력(입력받은 연도에 bul을 빼면 불기년도 출력)
        System.out.println(year - bul);
    }//main end
}//class end
