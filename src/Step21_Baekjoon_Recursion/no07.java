package Step21_Baekjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no07 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        //N에 따른 이동횟수의 공식은 아래와 같다.
        sb.append((int)(Math.pow(2, N) - 1)).append('\n');
        move(N, 1, 2, 3);
        System.out.println(sb);
    }//main end
    public static void move(int N, int start, int mid, int to){
       //N : 원판의 개수 start : 출발지 mid : 옮기기 위해 이동해야 하는 장소 to : 목적지
       if(N == 1){//이동해야 하는 원반의 수가 1개라면?
           sb.append(start + " " + to + "\n");
           return;
       }//if end
       //A >> C로 옮긴다 가정
       //STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
       move(N-1, start, to, mid);
       //STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
       sb.append(start + " " + to + "\n");
       //STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
       move(N-1, mid, start, to);
    }//move end
}//class end