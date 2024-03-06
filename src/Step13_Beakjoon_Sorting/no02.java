package Step13_Beakjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int sum = 0;

        for(int i = 0 ; i < 5 ; i++){
            int a = Integer.parseInt(reader.readLine());
            list.add(i, a);
            sum += a;
        }

        reader.close();

        //System.out.println(sum);

        //입력한 리스트를 오름차순으로 정렬하는 메서드
        Collections.sort(list);

        int centerNum = list.get(2);
        int avg = sum/5;

        System.out.println(avg);
        System.out.println(centerNum);

    }//main end
}//class end