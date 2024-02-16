package Step9.BAEKJOON_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");;

        int count = 0;

        boolean bl = false;

        for( int i = 0 ; i < N ; i++ ){
            int a = Integer.parseInt(st.nextToken());
            //System.out.print("a = " + a + " ");
            if( a == 1 ){
                bl = false;
            }else if(a == 3 || a == 2){
               bl = true;
            }else{
                //1과 자기자신은 모든 수가 가진 약수이므로, 소수의 조건을 만족하기 위해선 2부터 자기자신보다 1작은 수까지 비교해야한다.
                for( int q = 2 ; q < a ; q++ ){
                    if(a % q == 0){
                        bl = false;
                        break;
                    }else{
                        bl = true;
                    }//else end
                }//for2 end
            }//else end

            if( bl == true ){
                count++;
            }//if end

            //System.out.println("sum = " + count);

        }//for end

        System.out.println(count);

    }//main end
}//class end
