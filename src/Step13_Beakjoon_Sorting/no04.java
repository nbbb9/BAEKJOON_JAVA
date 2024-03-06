package Step13_Beakjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //빠른 속도를 위해 StringBuilder사용.
        StringBuilder builder = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());
        //입력값을 모두 저장하는 list
        List<Integer> list =  new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }//for end
        //입력한 리스트를 오름차순으로 정렬하는 메서드
        Collections.sort(list);
        //향상된 for문을 사용해서 builder에 값을 저장.
        //줄바꿈을 위해 '\n' 수행
        for(int i : list){
            builder.append(i).append('\n');
        }//for end
        //결과값 출력
        System.out.println(builder);
    }//main end
}//class end
