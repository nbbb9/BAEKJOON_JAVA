package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//참고 블로그
//https://girawhale.tistory.com/3
//https://st-lab.tistory.com/132
public class no08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n+1];
        int[] temp = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }//for end
        br.close();
        // 초기값 설정
        if (n >= 1) temp[1] = ary[1];
        if (n >= 2) temp[2] = ary[1] + ary[2];
        // DP 계산
        for (int i = 3; i <= n; i++) {
            temp[i] = Math.max(temp[i - 2], temp[i - 3] + ary[i - 1]) + ary[i];
        }//for end
        System.out.println(temp[n]);
    }//main end
}//class end