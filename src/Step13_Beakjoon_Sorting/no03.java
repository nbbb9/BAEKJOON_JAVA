package Step13_Beakjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class no03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;

        List<Integer> score = new ArrayList<>();
        st = new StringTokenizer(reader.readLine(), " ");
        for(int i = 0 ; i < N ; i++){
            int a = Integer.parseInt(st.nextToken());
            score.add(i, a);
        }//for end

        reader.close();

        Collections.sort(score, Collections.reverseOrder());

        System.out.println(score.get(K));
    }//main end
}//class end
