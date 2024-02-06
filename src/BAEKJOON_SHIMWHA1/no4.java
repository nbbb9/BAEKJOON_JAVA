package BAEKJOON_SHIMWHA1;

import java.util.Scanner;

public class no4 {
    //해결 안됨
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        //str을 char형 배열로 변경
        char [] chars = str.toCharArray();

        int gilee = str.length();

        boolean bl = false;

        for ( int i = 0 ; i < gilee ; i++ ){
            if( chars[i] == chars[gilee-(i+1)] ){
                bl = true;
            }
        }//for end

        if( bl == true ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }//if end

    }//main end
}//class end
