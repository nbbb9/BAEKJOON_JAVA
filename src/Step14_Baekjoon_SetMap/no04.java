package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> pockemon_num = new HashMap<>();
        Map<String, Integer> pocketmon_str = new HashMap<>();

        for(int i = 1 ; i <= N ; i++){
            String monName = reader.readLine();
            pockemon_num.put(i, monName);
            pocketmon_str.put(monName, i);
        }//for end

        //값이 잘들어갔는지 확인하기 위한 코드
//        for (int i = 0; i < pockemon.size(); i++) {
//            System.out.println(pockemon.get(i));
//        }//for end

        for(int i = 0; i < M ; i++){
            String question = reader.readLine();
            // 입력값이 숫자인지 문자인지 정규 표현식 "-?\\d+"을 사용하여 판별
            //https://adjh54.tistory.com/104 >> 정규표현식 정리 블로그
            if(question.matches("-?\\d+")){ // 숫자인 경우
                int id = Integer.parseInt(question);
                System.out.println(pockemon_num.get(id));
            } else { // 문자인 경우
                System.out.println(pocketmon_str.get(question));
            }//if-else end
        }//for end

    }//main end
}//class end
