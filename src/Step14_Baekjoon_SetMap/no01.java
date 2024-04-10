package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class no01 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        //상근이의 카드를 저장하는 HashMap 선언.
        //String을 받는 이유는 Integer로 받으면 String으로 입력하는 값을
        //Int로 변환하는 시간이 걸리기 때문.
        //Hashing을 사용하는 이유는 빠른 데이터 탐색에 유리하기 때문이다.
        //Key만 사용하는 이유는 해당 문제에서는 각 숫자의 존재여부만 확인하면 되기 때문이다.
        //각 숫자를 Key에 입력하여 Key만 비교하면 되기 때문이다.
        HashMap<String, Integer> owned = new HashMap<>();
        //N 변수 선언.
        int N = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        //상근이가 가지고 있는 숫자 카드를 N만큼 입력.
        //앞서 말했듯 value는 중요하지 않으므로 0으로 설정.
        for (int i=0; i<N; i++) {
            owned.put(st.nextToken(), 0);
        }//for end
        //비교할 숫자카드의 개수를 입력받는 변수 M
        int M = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        //찾고자 하는 숫자들을 한 줄 입력 받은 뒤, 하나씩 get() 함수를 사용하여 HashMap에서 숫자를 검색.
        //get() 함수는 key값을 매개변수로 가지는데, 해당 key값을 가진 entry가 HashMap 안에 있으면
        //그 key의 value를 return하고, 없으면 null값을 return하는 성질.
        for (int i=0; i<M; i++) {
            if (owned.get(st.nextToken()) != null) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }//if-else end
        }//for end
        System.out.println(sb.toString());
    }//main end
}//class end