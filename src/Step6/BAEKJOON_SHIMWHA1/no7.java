package Step6.BAEKJOON_SHIMWHA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class no7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int count = 0;

        for(int i = 0 ; i < N ; i++){
            String str = reader.readLine();
        }//for end

        //BufferedReader 종료
        reader.close();

    }//main end

    public static boolean checkAlpa(String str){
        boolean[] check = new boolean[26];
        int prev = 0;

        for(int i = 0; i < str.length(); i++) {
            // i 번째 문자 저장 (현재 문자)
            int now = str.charAt(i);
            // 앞선 문자와 i 번째 문자가 같지 않다면? >> 해당부분 이해안됨.
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if ( check[now - 'a'] == false ) {
                    // true 로 바꿔준다
                    check[now - 'a'] = true;
                    // 다음 턴을 위해 prev 도 바꿔준다
                    prev = now;
                }
                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    //함수 종료
                    return false;
                }
            }
        }
        return true;
    };
}//class end
