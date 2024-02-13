package Step8.BAEKJOON_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no3 {
    public static void main(String[] args) throws IOException {
        //BufferedReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스를 입력받는 변수 N
        int N =  Integer.parseInt(reader.readLine());
        //입력받은 테스트케이스만큼 반복문 실행
        for(int i = 0 ; i < N ; i++){
            //1회의 테스트케이스동안 거스름돈을 입력받는다.
            int inputC = Integer.parseInt(reader.readLine());
            //각 화폐의 단위가 몇개인지를 알아야하므로 단위만큼 나누고,
            // 해당값을 정수형으로 변환한다.
            int Q  = inputC / 25 ;
            int D  = (inputC % 25) / 10 ;
            int NK = ((inputC % 25) % 10) / 5;
            int P  = (((inputC % 25) % 10) % 5) / 1;
            //각 화폐 단위의 개수 출력.
            System.out.println(Q + " " + D + " " + NK + " " + P);
        }//for end

    }//main end
}//class end
