package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int[] dp = new int[N + 1];//dp[i]는 i를 1로 만들기 위한 최소 연산 횟수
        //초기값 설정
        dp[1] = 0;//1은 이미 1이므로 0회
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;//1 빼기
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);//2로 나누기
            }//if end
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);//3으로 나누기
            }//if end
        }//for end
        System.out.println(dp[N]); // 최소 연산 횟수 출력
    }//main end
}//class end