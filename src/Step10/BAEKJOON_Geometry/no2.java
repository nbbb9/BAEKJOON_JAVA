package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        //우측 상단 높이와 나의 높이의 차이
        int transverse = w - x;
        //우측 상단 넓이와 나의 넓이 차이
        int length = h - y;

        int minNum = Math.min(Math.min(x, y), Math.min(transverse, length));

        System.out.println(minNum);

    }//main end
}//class end
