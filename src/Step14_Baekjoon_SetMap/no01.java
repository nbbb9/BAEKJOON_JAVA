package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(reader.readLine());

        List<Integer> NArray = new ArrayList<>();

        st = new StringTokenizer(reader.readLine(), " ");
        for(int i = 0 ; i < N ; i++){
            int a = Integer.parseInt(st.nextToken());
            NArray.add(i, a);
        }

        int M = Integer.parseInt(reader.readLine());

        List<Integer> MArray = new ArrayList<>();

        st = new StringTokenizer(reader.readLine(), " ");
        for(int i = 0 ; i < M ; i++){
            int a = Integer.parseInt(st.nextToken());
            boolean found = false; // 일치하는 요소를 찾았는지 여부를 나타내는 플래그
            for(int q = 0 ; q < N ; q++){
                if(NArray.get(q).equals(a)){
                    MArray.add(1); // 일치하는 요소를 찾았으므로 1 추가
                    found = true; // 일치하는 요소를 찾았으므로 플래그를 true로 설정
                    break; // 일치하는 요소를 찾았으므로 더 이상의 순회는 불필요
                }
            }
            if(!found){ // 모든 순회를 마쳤으나 일치하는 요소를 찾지 못한 경우
                MArray.add(0); // 0 추가
            }
        }

        reader.close();

        for (int i = 0; i < MArray.size(); i++) {
            sb.append(MArray.get(i)).append(" ");
        }

        System.out.println(sb.toString());

    }//main end
}//class end
