package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no01 {
    public static void main(String[] args) throws IOException {
        //유클리드 호제법 >> https://velog.io/@yerin4847/W1-%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C-%ED%98%B8%EC%A0%9C%EB%B2%95
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int gcd = gcd(A, B); // 최대공약수 구하기
            int lcm = A * B / gcd; // 최소공배수 구하기
            System.out.println(lcm);
        }//for end
        br.close();
    }//main end
    // 유클리드 호제법으로 최대공약수를 구하는 메소드 >> 가장 기본적인 형태의 구현방식
    public static int gcd(int a, int b) {
        while (b != 0) {//b가 0이 될 때까지
            int r = a % b;//a를 b로 나눈 나머지 r을 구한다.
            a = b;//b의 값을 a에 할당한다.
            b = r;//r의 값을 b에 할당한다.
        }//while end
        return a;//b가 0이 되었을 때, a는 최대공약수가 된다.
    }//gcd end
}//class end