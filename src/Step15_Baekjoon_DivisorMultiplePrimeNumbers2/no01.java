package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no01 {
    public static void main(String[] args) throws IOException {
        //유클리드 호제법 사용. >> 공부 필요
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
        while (b != 0) {
            int r = a % b;//a를 b로 나눈 나머지 r을 구한다.
            a = b;//b의 값을 a에 할당한다.
            b = r;//r의 값을 b에 할당한다.
        }//while end
        return a;//b가 0이 되었을 때, a는 최대공약수가 된다.
    }//gcd end

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int T = Integer.parseInt(br.readLine());
//
//        int[] AAry = new int[T];
//        int[] BAry = new int[T];
//        int[] result = new int[T];
//
//        for(int i = 0; i < T; i++) {
//            st = new StringTokenizer(br.readLine());
//            AAry[i] = Integer.parseInt(st.nextToken());
//            BAry[i] = Integer.parseInt(st.nextToken());
//        }
//
//        br.close();
//
//        for(int i = 0; i < T; i++) {
//            int A = AAry[i];
//            int B = BAry[i];
//            if(A%B == 0){
//                result[i] = A;
//                continue;
//            } else if (B%A == 0) {
//                result[i] = B;
//                continue;
//            } else {
//                for(int j = 1 ; j <= 45000 ; j++)
//                {
//                    if(j%A == 0 && j%B == 0){
//                        result[i] = j;
//                        break;
//                    }//if2 end
//                }//for2 end
//            }//if-else end
//        }//for end
//
//        for(int i = 0 ; i < T; i++){
//            System.out.println(result[i]);
//        }//for end
}//class end