package Step25_Baekjoon_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());//도시의 개수
        long[] dis = new long[N-1];//각 도시 사이의 거리
        long[] price = new long[N];//각 도시별 기름 가격
        long result = 0;//결과값(최종 가격)

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N-1 ; i++){//거리 입력
            dis[i] = Long.parseLong(st.nextToken());
        }//for end
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){//가격 입력
            price[i] = Long.parseLong(st.nextToken());
        }//for end

        long minPrice = price[0];//제일 저렴한 가격(초기값은 제일 처음 도시 가격)

        for(int i = 0; i < N-1; i++) {//마지막 가격은 고려 X
            //현재 도시에서 다음 도시로 이동할 때
            if (minPrice > price[i]) {
                minPrice = price[i];//더 저렴한 가격으로 업데이트
            }//if end
            //현재 도시에서 다음 도시까지의 거리만큼 비용을 계산
            result += minPrice * dis[i];
        }//for end

        System.out.println(result);
    }//main end
}//class end