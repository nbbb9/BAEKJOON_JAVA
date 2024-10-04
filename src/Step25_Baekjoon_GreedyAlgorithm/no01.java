package Step25_Baekjoon_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class no01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//동전 종류
        int K = Integer.parseInt(st.nextToken());//목표 합
        int[] coins = new int[N];//동전 종류를 담을 배열 coins

        for(int i = 0 ; i < N ; i++){//동전 종류 입력 및 저장
           coins[i] = Integer.parseInt(br.readLine());
        }//for end
        br.close();

        int count = 0;//K가 되기위해 필요한 동전의 최소값

        for (int i = N - 1; i >= 0; i--) {//동전의 종류를 큰 것부터 선택
            while (K >= coins[i]) {//현재 동전으로 K를 줄일 수 있을 때까지 반복
                K -= coins[i];
                count++;
            }//while end
        }//for end

        System.out.println(count);

    }//main end
}//class end