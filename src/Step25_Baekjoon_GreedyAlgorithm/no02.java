package Step25_Baekjoon_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class no02 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());//회의 수
        int[][] ary = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ary[i][0] = Integer.parseInt(st.nextToken());//시작 시간
            ary[i][1] = Integer.parseInt(st.nextToken());//종료 시간
        }//for end
        br.close();

        //종료 시간을 기준으로 정렬하고, 종료 시간이 같으면 시작 시간을 기준으로 정렬
        Arrays.sort(ary, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);//종료 시간이 같으면 시작 시간 기준
            }//if end
            return Integer.compare(a[1], b[1]);//종료 시간 기준
        });//sort end

        int count = 0;//참가할 수 있는 회의의 개수를 저장하는 변수
        int endTime = 0;//회의 종료 시간을 계산할 변수

        for(int i = 0; i < N; i++) {
            //직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if(endTime <= ary[i][0]) {
                endTime = ary[i][1];
                count++;
            }//if end
        }//for end

        System.out.println(count);

    }//main end
}//class end