package Step09_Baekjoon_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //소인수분해할 수를 입력받는 변수 N
        int N = Integer.parseInt(reader.readLine());
        //StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();
        //나누는 수 div
        int div = 2;
        //N이 1이 될때까지 반복한다.
        while( N != 1 ){
            //만약 div가 N의 소수라면
            if( N % div == 0 ) {
                //N에 N/div의 값을 저장.
                N /= div;
                //StringBuilder에 문자 추가
                sb.append(div + "\n");
            }else{//div가 N의 소수가 아니라면
                //소수일때까지 1을 더한다.
                div++;
            }//if-else end
        }//while end
        //결과 출력
        System.out.println(sb);
    }//main end
}//class end
