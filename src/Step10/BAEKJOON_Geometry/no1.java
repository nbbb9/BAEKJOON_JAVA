package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //세로길이를 입력받는 변수 A
        int A = Integer.parseInt(reader.readLine());
        //가로길이를 입력받는 변수 B
        int B = Integer.parseInt(reader.readLine());
        //두 길이를 곱하면 결과값 출력
        System.out.println(A * B);
    }//main end
}//class end
