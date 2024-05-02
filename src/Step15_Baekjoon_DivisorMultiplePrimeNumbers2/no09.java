package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int count = 1;
        for( int i = 2; i*i <= N; i++ ){
            count++;
        }//for end
        System.out.println( count );
    }//main end
}//class end