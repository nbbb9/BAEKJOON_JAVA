package BAEKJOON_BANBOKMOON;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            System.out.println((A + B));
        }
    }
}