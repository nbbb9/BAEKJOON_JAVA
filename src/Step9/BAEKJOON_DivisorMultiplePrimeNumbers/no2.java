package Step9.BAEKJOON_DivisorMultiplePrimeNumbers;

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
        int count = 0;
        int result = 0;

        for(int i = 1 ; i <= N ; i++){
            if( N % i == 0 ){
                count++;
                if( count == B ){
                    result = i;
                    break;
                }//if2 end
            }//if end
        }//for end

        System.out.println(result);

    }//main end
}//class end
