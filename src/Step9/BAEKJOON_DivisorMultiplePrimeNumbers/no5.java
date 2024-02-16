package Step9.BAEKJOON_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //시작값을 입력받는 변수 M, 마지막값을 입력받는 변수 N
        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        reader.close();

        ArrayList<Integer> aryList = new ArrayList<>();

        int sum = 0;
        int min = 0;

        boolean bl = false;

        int x = 0;

        for( int i = M ; i <= N ; i++){
            if( i == 1 ){
                continue;
            }else if( i == 2 || i == 3){
                sum += i;
            }else{
                for(int q = 2 ; q < i ; q++){
                    if( i % q == 0 ){
                        bl = false;
                        continue;
                    }else{
                        bl = true;
                        sum += i;
                        continue;
                    }//else2 end
                }//for2 end
            }//else end
        }//for end

        System.out.println(sum);

    }//main end

}//class end
