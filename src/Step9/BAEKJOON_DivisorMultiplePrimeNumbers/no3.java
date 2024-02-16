package Step9.BAEKJOON_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            ArrayList<Integer> aryList = new ArrayList<Integer>();
            int sum = 0;
            //약수를 구할 수를 입력받는 변수 n
            int n = Integer.parseInt(reader.readLine());
            //n이 -1이라면 시스템 종료
            if( n == -1){
                System.exit(0);
            }
            //i = 1부터 n보다 작을때까지
            for(int i = 1 ; i < n ; i++){
                if( n % i == 0 ){
                    aryList.add(i);
                }
            }
            //System.out.println(ary);

            for(int i = 0 ; i < aryList.size() ; i++){
                sum += aryList.get(i);
            }
            //System.out.println(sum);

            if( sum == n ){
                System.out.print(n + " = ");
                for(int i = 0 ; i < aryList.size() ; i++){
                    if( i == aryList.size()-1 ){
                        System.out.println( aryList.get(i));
                    }else{
                        System.out.print( aryList.get(i) + " + " );
                    }//else end
                }//for end
            }else{
                System.out.println(n + " is NOT perfect.");
            }//else end

        }//while end

    }//main end
}//class end
