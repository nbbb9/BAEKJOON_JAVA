package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] rgb = new int[N][3];
        int[][] minAry = new int[N][3];//최소 비용을 계산하기 위한 2차원 배열
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            rgb[i][0] = Integer.parseInt(st.nextToken());//R
            rgb[i][1] = Integer.parseInt(st.nextToken());//G
            rgb[i][2] = Integer.parseInt(st.nextToken());//B
        }//for end
        br.close();
        //1행 초기값 설정
        minAry[0][0] = rgb[0][0];
        minAry[0][1] = rgb[0][1];
        minAry[0][2] = rgb[0][2];
        for (int i = 1; i < N; i++) {
            //minAry의 2행부터 값을 정해야함.
            //각 열마다 앞열과는 다른 색이 나와야 하므로, 해당열과는 다른 2개의 값만 비교 후 계산.
            //그다음, 최소비용을 구해야하기 때문에 rgb배열의 해당 값을 더함.
            minAry[i][0] = Math.min(minAry[i - 1][1], minAry[i - 1][2]) + rgb[i][0]; // R
            minAry[i][1] = Math.min(minAry[i - 1][0], minAry[i - 1][2]) + rgb[i][1]; // G
            minAry[i][2] = Math.min(minAry[i - 1][0], minAry[i - 1][1]) + rgb[i][2]; // B
        }//for end
        //맨 아래 행의 3개의 값은 각 비용들의 합이 구해져 있음. 따라서 3개의 값중 최소값이 정답.
        System.out.println(Math.min(Math.min(minAry[N - 1][0], minAry[N - 1][1]), minAry[N - 1][2]));
    }//main end
}//class end