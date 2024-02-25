package Step11_Baekjoon_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no03 {
    public static void main(String[] args) throws IOException {
//        MenOfPassion(A[], n) {
//            sum = 0;
//            for i = 1 to n
//              for j = 1 to n
//                  sum = sum + A[i] × A[j];
//            return sum;
//        }
        //O(n^2)의 시간 복잡도
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //입력값이 커서 long으로
        long n = Integer.parseInt(reader.readLine());
        reader.close();
        //n^2이므로 입력값을 두번 곱해주면 된다.
        System.out.println(n*n);
        //최고 차수는 2 고정.
        System.out.println(2);
    }//main end
}//class end
