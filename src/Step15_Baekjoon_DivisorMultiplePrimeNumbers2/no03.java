package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        br.close();
        int gcd = gcd(B, D); // 최대공약수 구하기
        int lcm = B * D / gcd; // 최소공배수 구하기
        //분모를 통분했으므로, 분자도 동일하게 계산
        int result = (A*(lcm/B)) + (C*(lcm/D));
        //기약분수로 만들어야함. 분자,분모의 최대공약수로 각각 나누면, 기약분수가 성립
        gcd = gcd(lcm, result);
        result  /= gcd;
        lcm /= gcd;
        System.out.println(result + " " + lcm);
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