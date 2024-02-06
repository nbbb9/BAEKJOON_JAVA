package BAEKJOON;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        int year = scanner.nextInt();
        //불기년도 = 543년 차이
        int bul = 543;

        System.out.println(year - bul);
    }
}
