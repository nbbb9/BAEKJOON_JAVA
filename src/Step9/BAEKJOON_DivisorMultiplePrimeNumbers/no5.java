package Step9.BAEKJOON_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //시작값을 입력받는 변수 M, 마지막값을 입력받는 변수 N
        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());
        //reader 종료
        reader.close();
        //소수들의 총합을 저장하는 변수 sum
        int sum = 0;
        //소수들 중 최소값을 저장하는 변수 min. 우선 가장 처음값인 M으로 초기화한다.
        int min = M;
        //반복문을 돌면서 해당 수가 소수인지 아닌지 판별하기 위한 변수 bl
        boolean bl = false;
        //해당소수가 몇번째인지 알아내기위한 변수 count
        int count = 0;
        //M부터 N까지 반복하면서 소수를 찾는 과정.
        for( int i = M ; i <= N ; i++){
            //1은 소수가 아니므로 false반환.
            if( i == 1 ){
                bl = false;
            //2와 3은 소수이므로 true반환.
            }else if( i == 2 || i == 3){
                bl = true;
            //1,2,3모두 아닐경우
            }else{
                //1과 자기자신을 뺀 나머지를 각각 나눠보면서 소수인지 아닌지 판단.
                //2부터 자기자신보다 하나 작은 숫자까지
                for(int q = 2 ; q < i ; q++){
                    //만약 나머지가 0이라면 소수가 아니므로 false반환하고 반복문 종료.
                    if( i % q == 0 ){
                        bl = false;
                        break;
                    //나머지가 0이 아니라면 소수이므로 true.
                    }else{
                        bl = true;
                    }//else2 end
                }//for2 end
            }//else end
            //반복문을 모두 마치고 반환값이 true라면 sum에 해당값을 더하고 count++를 통해 몇번째 소수인지 구함.
            if(bl == true){
                sum += i;
                count++;
                //소수가 잘 구해졌는지 테스트하기위한 코드
                //System.out.println(i + "은(는) 소수. 해당 소수는 " + count + "번째 입니다.");
                //만약 count가 1이라면 첫번째 소수, 즉 최솟값이므로 min에 해당값을 저장.
                if( count == 1 ){
                    min = i;
                }//if2 end
            }//if end
        }//for end
        //만약 sum이 0이라면, 소수가 없는것이므로 -1출력.
        if(sum == 0){
            System.out.println(-1);
        }else {
            //소수가 하나라도 존재할경우의 결과값 출력.
            System.out.println(sum);
            System.out.println(min);
        }//if-else end

    }//main end

}//class end
