package Step25_Baekjoon_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class no04 {
    public static void main(String[] args) throws IOException {
        //최소값을 구하기 위해선 모든값을 더한 후 빼주면된다. 그렇기에 우선 '-'를 기준으로 문자열을 나누고 '+'연산을 모두 해준다음 '-'를 계산하면 최소값이 나온다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;//초기 상태 여부 확인을 위한 값으로 설정. 덧셈 결과를 저장하기 위해.
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");//'-'를 기준으로 나눔
        while(subtraction.hasMoreTokens()) {//다음 읽어들일 token이 없을 때 까지
            int temp = 0;
            //뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");//'+'를 기준으로 나눈다음 연산.
            //덧셈으로 나뉜 토큰들을 모두 더한다.
            while(addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }//while end
            //첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
            if(sum == Integer.MAX_VALUE) {
                sum = temp;
            }else{
                sum -= temp;
            }//if-else end
        }//while end
        System.out.println(sum);
    }//main end
}//class end