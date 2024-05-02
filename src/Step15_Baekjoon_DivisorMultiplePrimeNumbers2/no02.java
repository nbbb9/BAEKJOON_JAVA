package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        br.close();
        long gcd = gcd(A, B); // 최대공약수 구하기
        long lcm = A * B / gcd; // 최소공배수 구하기
        System.out.println(lcm);
    }//main end
    // 유클리드 호제법으로 최대공약수를 구하는 메소드 >> 가장 기본적인 형태의 구현방식
    public static long gcd(long a, long b) {
        while (b != 0) {//b가 0이 될 때까지
            long r = a % b;//a를 b로 나눈 나머지 r을 구한다.
            a = b;//b의 값을 a에 할당한다.
            b = r;//r의 값을 b에 할당한다.
        }//while end
        return a;//b가 0이 되었을 때, a는 최대공약수가 된다.
    }//gcd end
}//class end
