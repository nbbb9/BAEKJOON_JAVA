package Step12_Beakjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        //결과값을 저장하는 변수 result
        int result = 0;
        //0부터 N까지 모두 돌면서 N의 가장 생성자를 계산하고 찾음.
        for(int i = 0 ; i < N ; i++){
            //0부터 N까지 도는 값을 저장하는 저장하는 변수 num
            int num =  i;
            //각 자리수의 합을 더하는는 값을 저장하는 변수 sum
            int sum = 0;
            //num이 모든 자리수를 돌때까지
            while(num != 0){
                //sum에 각 자리수를 더한다.
                //3자리수를 10으로 나눈 나머지(각자리의 값)를 sum에 더하고
                //num의 10으로 나눈 값(sum에 더한 각자리의 값을 제외한 나머지)를 num에 저장한다.
                //ex) 198인 경우 처음에는 sum이 8이된다(1의자리) num은 19가 남는다(백,십의자리) ...
                sum += num % 10;
                num /= 10;
            }//while end
            //만약 sum과 현재 회차의 수(i)를 더한값이 N과 같다면(i는 N의 생성자)
            if(sum + i == N){
                //result에 i를 저장하고 반복문 종료.
                result = i;
                break;
            }//if end
        }//for end
        //결과값 출력
        System.out.println(result);
    }//main end
}//class end
