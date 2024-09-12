package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] temp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }//for end
        br.close();
        //초기값 설정
        temp[0] = array[0];
        int maxSum = temp[0];
        for(int i = 1 ; i < n ; i++){//이해가 안됨.
            temp[i] = Math.max(array[i], temp[i-1] + array[i]);
            maxSum = Math.max(maxSum, temp[i]);
        }//for end
        System.out.println(maxSum);
    }//main end
}//class end