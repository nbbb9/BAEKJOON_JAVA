package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no04 {
    public static long[] P;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        P = new long[101];
        tri();
        for(int i = 0 ; i < T ; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(P[N]);
        }//for end
        br.close();
    }//main end
    static void tri(){
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;
        for(int i = 6 ; i <= 100 ; i++){
            P[i] = P[i-1] + P[i-5];
        }//for end
    }//tri end
}//class end