package Step11_Baekjoon_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no06 {
    public static void main(String[] args) throws IOException {
//        MenOfPassion(A[], n) {
//            sum = 0;
//            for i = 1 to n - 2
//                 for j = i + 1 to n - 1
//                      for k = j + 1 to n
//                          sum = sum + A[i] × A[j] × A[k];
//            return sum;
//        }
        //n=5 10 / n=6 20 / n=7 35
        //O( n(n-1)(n-2)/6 )
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //입력값이 커서 long으로
        long n = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println(3);
    }//main end
}//class end
