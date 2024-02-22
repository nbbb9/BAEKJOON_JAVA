package Step9_Baekjoon_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        //약수를 구할 수를 입력받는 변수 N
        int N = Integer.parseInt(st.nextToken());
        //몇번째인지를 입력받는 변수 B
        int B = Integer.parseInt(st.nextToken());
        //회차를 진행하면서 B와 값이 같은지 비교하기위한 변수 count
        int count = 0;
        //결과값 출력을 위한 변수 result
        int result = 0;
        //1부터 N까지 반복문 수행
        for(int i = 1 ; i <= N ; i++){
            //만약 N나누기 i의 나머지가 0이라면 i는 약수이므로 count++ 수행
            if( N % i == 0 ){
                count++;
                //count가 B와 같다면 해당 약수(i)를 result에 저장하고 반복문 종료.
                if( count == B ){
                    result = i;
                    break;
                }//if2 end
            }//if end
        }//for end

        //결과값 출력
        System.out.println(result);

    }//main end
}//class end
