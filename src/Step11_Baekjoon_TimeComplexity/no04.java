package Step11_Baekjoon_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no04 {
    public static void main(String[] args) throws IOException {
//        MenOfPassion(A[], n) {
//            sum = 0;
//            for i = 1 to n - 1
//              for j = i + 1 to n
//                  sum = sum + A[i] × A[j];
//            return sum;
//        }
        //n=4 > 6 / n=5 > 10 / n=6 > 15 / n=7 > 21
        //O( (n(n-1))/2 )
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //입력값이 커서 long으로
        long n = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println( (n*(n-1))/2 );
        System.out.println(2);
    }//main end
}//class end
