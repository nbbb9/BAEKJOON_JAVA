package Step21_Baekjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(fibonacci(n));
    }//main end
    public static long fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }//if-else end
    }//fibonacci end
}//class end