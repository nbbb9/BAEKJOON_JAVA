package Step11_Baekjoon_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no07 {
    public static void main(String[] args) throws IOException {
        //함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.
        //해당 줄이 g(n) = O(n)이라는것을 말해준다.(문제 꼼꼼히 읽기)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        //각각의 입력값을 받아 저장하는 변수 선언.
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c  = Integer.parseInt(reader.readLine());
        int n0 = Integer.parseInt(reader.readLine());
        //reader종료
        reader.close();
        //결과값을 저장할 변수 result
        int result = 0;
        //n0부터 100까지(문제에 n의 범위 확인 필)반복하면서
        // "모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다"
        // 조건을 만족하는지 확인
        for(int i = n0 ; i <= 100 ; i++){
            //f(n)함수에 입력받은 알맞은 값을 넣어 O(n)XC보다 작고 같은지 확인
            int fnResult = fn(a1, a0, i);
            if( fnResult <= (c*i) ){
                //만족한다면 1
                result = 1;
            }else{
                //아니라면 0 저장하고 break;
                result = 0;
                break;
            }//if-else end
        }//for end

        System.out.println(result);
        
    }//main end
    public static int fn(int a1, int a0, int n){//f(n)함수 구현.
        int result = (a1 * n) + a0;
        return result;
    }//fn method end
}//class end
