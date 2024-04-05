package Step13_Baekjoon_Sorting;

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
            //한번 입력받을때마다 더해서 모두 합한값을 구한다.
            //나중에 5로 나누면 평균값을 구할 수 있음.
            sum += a;
        }//for end
        //reader 종료
        reader.close();
        //입력한 리스트를 오름차순으로 정렬하는 메서드
        Collections.sort(list);
        //중앙값을 저장하는 변수 centerNum
        int centerNum = list.get(2);
        //평균값을 저장하는 변수 avg
        int avg = sum/5;
        //결과값 출력
        System.out.println(avg);
        System.out.println(centerNum);
    }//main end
}//class end