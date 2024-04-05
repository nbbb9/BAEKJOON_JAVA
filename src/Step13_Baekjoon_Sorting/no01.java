package Step13_Baekjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            int a = Integer.parseInt(reader.readLine());
            list.add(i, a);
        }//for end
        reader.close();
        //입력한 리스트를 오름차순으로 정렬하는 메서드
        Collections.sort(list);
        for(int i = 0 ; i < N ; i++){
            System.out.println(list.get(i));
        }//for end
    }//main end
}//class end
