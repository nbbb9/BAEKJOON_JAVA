package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> strMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //N만큼 문자열 입력후 strMap에 저장.
        for (int i = 0; i < N; i++) {
            strMap.put(reader.readLine(), 0);
        }//for end
        //같은 값이 있는지 계산하기위한 변수 count
        int count = 0;
        //M만큼 입력하면서 해당 값이 strMap에 있는지 없는지 판단하고 있다면 count++수행.
        for (int i=0; i<M; i++) {
            if (strMap.get(reader.readLine()) != null) {
                count++;
            }//if end
        }//for end
        //결과값 출력
        System.out.println(count);
    }//main end
}//class end
