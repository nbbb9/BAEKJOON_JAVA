package BAEKJOON_MOONJAYEAUL;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        //Scanner객체 생성
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i = 0 ; i < T ; i++){
            String str = scan.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }

    }
}
