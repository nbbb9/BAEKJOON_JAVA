package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, String> check = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            String name = st.nextToken();
            String log = st.nextToken();
            if(log.equals("enter")){
                check.put(name, log);
            } else if(log.equals("leave")){
                check.remove(name);
            }//if-else end
        }//for end

        reader.close();

        // HashMap의 키를 리스트로 변환
        List<String> nameList = new ArrayList<>(check.keySet());
        // 리스트를 사전 순으로 정렬
        Collections.sort(nameList);
        // 리스트를 역순으로 출력
        Collections.reverse(nameList);
        for (String name : nameList) {
            System.out.println(name);
        }//for end
    }//main end
}//class end
