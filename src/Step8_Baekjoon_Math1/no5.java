package Step8_Baekjoon_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class no5 {
    //결국 하나의 외곽으로 나갈 때가 1회 지나는 것이다.
    //처음 1번방부터 개수를 시작한다.
    //2부터 6개의 숫자만큼 외곽의 크기가 증가한다.
    //1 >> 6 >> 12 >> 18 >> 24 ......
    //각 외곽의 최대 숫자는 7, 19, 37, 61이다.
    //이것의 규칙은, 최대숫자에 각 외각의 개수만큼 더한 값이다.
    public static void main(String[] args) throws IOException {
        //BuffredReader객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //
        int N = Integer.parseInt(reader.readLine());
        //
        int count = 0;

        for(int i = 1 ; i <= N+6; i+=6){
            if( N <= i ){
                count++;
                break;
            }
        }

        System.out.println(count);

    }//main end
}//class end
