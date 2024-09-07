package Step21_Baekjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(factorial(N));
    }//main end
    public static long factorial(int N){
        if(N == 0){
            return 1;
        }else{
            return N * factorial(N-1);
        }//if-else end
    }//factorial end
}//class end