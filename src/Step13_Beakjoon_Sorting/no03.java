package Step13_Beakjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class no03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        //인덱스는 1작아야 하므로 입력값에 -1 수행
        int K = Integer.parseInt(st.nextToken()) - 1;
        //모든 점수를 저장하는 score 리스트
        List<Integer> score = new ArrayList<>();
        //반복문을 수행하면서 tokenizer로 구분해서 입력받아야 하므로 객체 다시 생성.
        st = new StringTokenizer(reader.readLine(), " ");
        for(int i = 0 ; i < N ; i++){
            int a = Integer.parseInt(st.nextToken());
            score.add(i, a);
        }//for end
        reader.close();
        //내림차순 정렬 수행.
        Collections.sort(score, Collections.reverseOrder());
        //결과값 출력
        System.out.println(score.get(K));
    }//main end
}//class end
