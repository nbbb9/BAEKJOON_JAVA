package Step13_Baekjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int[][] arr = new int[N][2];

        StringTokenizer st;//우선 선언만 해둔다.

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(reader.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]){
                return e1[1]-e2[1];
            }else{
                return e1[0]-e2[0];
            }
        });

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            builder.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(builder);

    }//main end
}//class end
