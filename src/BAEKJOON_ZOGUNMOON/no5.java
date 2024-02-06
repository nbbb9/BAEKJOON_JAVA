package BAEKJOON_ZOGUNMOON;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //시 입력 변수 hour
        int hour = sc.nextInt();
        //분 입력 변수 minute
        int minute = sc.nextInt();

        if( (hour < 0 || hour > 23) || (minute < 0 || minute > 59) ){
            //입력값 제한
            System.out.println("시 또는 분을 다시 입력하세요.");
        }else{
            if( hour == 0 ){
                //만약 시가 0시 일 때
                if( minute >= 45 ){
                    //분이 45분보다 크거나 같을때는 분에서 45분을 빼주면 된다.
                    System.out.print( hour + " " +( minute-45 ) );
                }else if( minute < 45 ){
                    //분이 45분보다 작을때는 시에서 1을 빼고 60분에서 45-분을 빼면 된다.
                    System.out.print( 23 + " " + (60-(45-minute)));
                }
            }else{
                if( minute >= 45 ){
                    //분이 45분보다 크거나 같을때는 분에서 45분을 빼주면 된다.
                    System.out.print( hour + " " + ( minute-45 ) );
                }else if( minute < 45 ){
                    //분이 45분보다 작을때는 시에서 1을 빼고 60분에서 45-분을 빼면 된다.
                    System.out.print( hour - 1 + " " + (60-(45-minute)));
                }
            }

        }

    }
}
