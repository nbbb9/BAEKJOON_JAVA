package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            X.add(x);
            Y.add(y);
        }

        int resultX = 0;
        int resultY = 0;


    }//main end
}//class end
