package Step11_Baekjoon_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no02 {
    public static void main(String[] args) throws IOException {
//        MenOfPassion(A[], n) {
//            sum = 0;
//            for i = 1 to n
//              sum = sum + A[i]; # 코드1
//            return sum;
//        }
        //O(n)의 시간 복잡도.
        //입력값 만큼 복잡도 증가.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        //입력값 만큼 수행을 진행.
        System.out.println(n);
        //차수는 1 고정이므로 1출력.
        System.out.println(1);
    }//main end
}//class end
