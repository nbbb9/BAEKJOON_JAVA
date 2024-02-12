package Step8.BAEKJOON_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1 {
    public static void main(String[] args) throws IOException {
        //10진수를 제외한 나머지 진수는 String으로 받아야 한다. -> int는 전부 10진수로 인식
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer 객체 생성. 빈칸럾이 받는다.
        StringTokenizer st = new StringTokenizer(reader.readLine());
        //입력하는 수를 저장하는 변수 N
        String N = st.nextToken();
        //진법을 입력받는 변수 B
        int B = Integer.parseInt(st.nextToken());



    }//main end
}//class end
