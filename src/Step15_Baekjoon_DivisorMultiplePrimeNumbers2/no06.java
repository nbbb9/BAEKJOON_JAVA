package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();
        for(int i = M ; i <= N ; i++){
            if(isPrime(i) == 1){
                System.out.println(i);
            }//if end
        }//for end
    }//main end
    public static int isPrime(long n){//소수일경우 1, 아닐경우 0
        if (n < 2){
            return 0;
        }//if else
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }//if end
        }//for end
        return 1;
    }//isPrime end
}//class end