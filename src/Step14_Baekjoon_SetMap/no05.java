package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        //상근이가 가지고있는 숫자카드의 개수 N
        int N = Integer.parseInt(reader.readLine());
        //상근이가 가지고 있는 숫자카드를 저장하는 Map owned
        Map<String, Integer> owned = new HashMap<>();

        st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            //N만큼 반복하면서 상근이가 가지고있는 숫자카드를 입력받는다.
            String num = st.nextToken();
            //num의 등장 횟수를 가져오는 함수. 만약, num이 존재하지 않으면 기본값 0을 반환
            //존재한다면 존재 횟수만큼 값을 반환하고, 지금 입력하면 1개가 추가되므로 +1 수행.
            owned.put(num, owned.getOrDefault(num, 0)+1);
        }//for end

        //비교할 숫자카드의 개수 M
        int M = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine(), " ");
        for(int i = 0 ; i < M ; i++){
            //M만큼 반복하면서 입력받은 값이 멸개나 있는지 찾고 반환함.
            //만약 존재하지 않는다면 0을 반환하고 해당 값을 sb에 append함.
            sb.append(owned.getOrDefault(st.nextToken(), 0)).append(" ");
        }//for end
        //trim()을 수행하는 이유는 문자열의 마지막에 추가된 공백을 제거하기 위함.
        System.out.println(sb.toString().trim());
    }//main end
}//class end