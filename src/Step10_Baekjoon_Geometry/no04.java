package Step10_Baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        //규칙성을 찾는것이 중요.
        //결국, 입력값에 4를 곱하는것이 답이다.
        System.out.println(n*4);
    }//main end
}//class end
