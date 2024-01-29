package BAEKJOON_ZOGUNMOON;

import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if( (year < 1) || year > 4000 ){
            System.out.println("년도는 1~4000년까지 입력하세요.");
        }else{
            if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
