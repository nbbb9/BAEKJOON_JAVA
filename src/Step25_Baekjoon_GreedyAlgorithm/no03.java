package Step25_Baekjoon_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class no03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        int sum = 0;
        int result = 0;

        for(int i = 0 ; i < N ; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }//for end

        Arrays.sort(time);

        for(int i = 0 ; i < N ; i++){
            sum += time[i];
            time[i] = sum;
            result += time[i];
        }//for end

        System.out.println(result);

    }//main end
}//class end