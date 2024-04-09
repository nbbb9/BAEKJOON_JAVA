package Step13_Baekjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //set은 데이터의 중복을 허용하지 않는다. 중복된 값이 존재한다면 무시된다.
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                //substring은 첫인자의 인덱스부터 두번째 인덱스 전까지 자른다.
                //부분 문자열은 하나하나 짝을 이루는 방식(?)이므로 하나하나 잘라보면서 set에 넣는다.
                //set은 중복값을 허용하지 않으므로 중복값을 넣으면 자동으로 무시된다.
                set.add(str.substring(i, j));
            }//for2 end
        }//for end
        System.out.println(set.size());
    }//main end
}//class end