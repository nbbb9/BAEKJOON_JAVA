package Step9_Baekjoon_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //무한반복을 위한 true
        while(true){
            ArrayList<Integer> aryList = new ArrayList<Integer>();
            int sum = 0;
            //약수를 구할 수를 입력받는 변수 n
            int n = Integer.parseInt(reader.readLine());
            //n이 -1이라면 시스템 종료
            if( n == -1){
                System.exit(0);
            }//if end
            //i = 1부터 n보다 작을때까지 i가 n의 약수라면 리스트에 저장한다.
            for(int i = 1 ; i < n ; i++){
                if( n % i == 0 ){
                    aryList.add(i);
                }//if end
            }//for end
            //리스트에 잘들어갔는지 확인하는 코드
            //System.out.println(ary);

            //리스트의 모든항목을 반복문을 통해 더한다.
            for(int i = 0 ; i < aryList.size() ; i++){
                sum += aryList.get(i);
            }//for end
            //sum이 정상적으로 저장되었는지 확인하는 코드
            //System.out.println(sum);

            //만약, n이 완전수라면(문제참고)
            if( sum == n ){
                System.out.print(n + " = ");
                for(int i = 0 ; i < aryList.size() ; i++){
                    //마지막인덱스일경우 + 를 출력하면 안되기때문에 따로 조건문 설정
                    if( i == aryList.size()-1 ){
                        System.out.println( aryList.get(i));
                    }else{
                        System.out.print( aryList.get(i) + " + " );
                    }//else end
                }//for end
            }else{//완전수가 아닐경우
                System.out.println(n + " is NOT perfect.");
            }//else end

        }//while end

    }//main end
}//class end
