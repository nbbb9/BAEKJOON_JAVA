package Step6.BAEKJOON_SHIMWHA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class no5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ary = new int[26];

        String str = reader.readLine();

        for( int i = 0 ;  i < str.length() ; i++){
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) { // 대문자 범위
                ary[str.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위
                ary[str.charAt(i) - 97]++;
            }
        }

    }//main end
}//class end
