package Step10_Baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        //나의 위치는 x,y
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        //오른쪽 상단 점의 좌표 w,h
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        //우측 상단 높이와 나의 높이의 차이
        int transverse = w - x;
        //우측 상단 넓이와 나의 넓이 차이
        int length = h - y;
        //나의 위치가 transverse와 length보다 짧을 수 도 있기때문에, 각각의 값들의 최소를 구하고,
        //그 결과의 최소를 또 비교하면 변으로 접근할 수 있는 가장 짧은 거리가 나온다.
        int minNum = Math.min(Math.min(x, y), Math.min(transverse, length));
        //결과값 출력
        System.out.println(minNum);
    }//main end
}//class end
