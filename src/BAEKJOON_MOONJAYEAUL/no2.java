package BAEKJOON_MOONJAYEAUL;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        //Scanner객체 생성
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int count = 0;

        for(int i = 0 ; i < str.length() ; i++) {
            count++;
        }

        System.out.println(count);

    }
}
