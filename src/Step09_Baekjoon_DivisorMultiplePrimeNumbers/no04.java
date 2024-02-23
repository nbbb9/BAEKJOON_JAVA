package Step09_Baekjoon_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //입력받을 수를 입력받는 변수 N
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");;
        int count = 0;
        //소수인지 아닌지 판별하기 위한 변수 bl
        boolean bl = false;
        //N의 모든 약수를 돌기위한 반복문
        for( int i = 0 ; i < N ; i++ ){
            int a = Integer.parseInt(st.nextToken());
            //System.out.print("a = " + a + " ");
            //1은 소수가 될 수 없으므로 false로 고정.
            if( a == 1 ){
                bl = false;
            }else if(a == 3 || a == 2){
                //2또는 3이 입력되었을 때 이 둘은 무조건 소수이므로 true 저장.
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
            //만약 소수가 맞다는 결과가 나온다면 count++를 수행한다.
            if( bl == true ){
                count++;
            }//if end
            //각 회차를 돌면서 개수가 맞게 계산되는지 확인하기 위한 코드
            //System.out.println("sum = " + count);
        }//for end
        //결과 출력
        System.out.println(count);
    }//main end
}//class end
