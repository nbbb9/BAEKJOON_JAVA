package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //듣도 못한 사람의 명단을 저장하는 Map detdo
        Map<String, Integer> detdo = new HashMap<>();
        // 사전순으로 정렬된 이름을 저장할 TreeSet
        TreeSet<String> sortedNames = new TreeSet<>();
        //N만큼 이름을 입력받음
        for(int i = 0; i < N; i++) {
            detdo.put(reader.readLine(), i);
        }//for end
        //듣보인 사람의 명수를 계산하기 위한 변수 count
        int count = 0;
        //M만큼 반복하면서 입력하는 값이 듣도못한 사람의 명단에 있는지 없는지 판단.
        //만약 있다면 count를 증가시키고 Treeset에 추가.
        for (int i = 0; i < M; i++) {
            String name = reader.readLine();
            if(detdo.containsKey(name)){//detdo.get(name)!=null 대신 containsKey 사용
                count++;
                sortedNames.add(name);//이름을 TreeSet에 추가
            }//if end
        }//for end
        System.out.println(count);
        //TreeSet을 순회하며 이름 출력
        for(String name : sortedNames) {
            System.out.println(name);
        }//for end
    }//main end
}//class end