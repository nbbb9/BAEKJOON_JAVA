package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no03 {//피보나치 수열과 같은 원리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        //dp 배열 선언 및 초기화
        int[] dp = new int[N + 1];
        dp[1] = 1;//1×1
        if (N >= 2) {
            dp[2] = 2;//2×1
        }//if end
        for (int i = 3; i <= N; i++) {//점화식에 따라 dp 배열 채우기
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }//for end
        System.out.println(dp[N]);
    }//main end
}//class end