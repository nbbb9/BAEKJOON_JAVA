package Step8.BAEKJOON_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no3 {
    //앞 3개의 화폐의 개수는 잘 나오는데 왜 마지막 페니만 1개가 적게 나오는지....?
    public static void main(String[] args) throws IOException {
        //BufferedReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스를 입력받는 변수 N
        int N =  Integer.parseInt(reader.readLine());

        //입력받은 테스트케이스만큼 반복문 실행
        for(int i = 0 ; i < N ; i++){
            //1회의 테스트케이스동안 거스름돈을 입력받는다.
            int inputC = Integer.parseInt(reader.readLine());
            //입력받은 거스름돈이 몇 달러인지를 나타내야 하므로 100.0을 곱해
            //실수형으로 만들어주면서 하위 단위까지 표시한다.
            double C = (inputC / 100.0);
            //거스름돈이 달러형태로 잘 변환되었는지 테스트하는 코드
            //System.out.println(C);
            //각 화폐의 단위가 몇개인지를 알아야하므로 단위만큼 나누고,
            // 해당값을 정수형으로 변환한다.
            int Q  = (int)( C / 0.25 );
            int D  = (int)( (C % 0.25) / 0.1 );
            int NK = (int)( ((C % 0.25) % 0.1) / 0.05 );
            int P  = (int)( (((C % 0.25) % 0.1) % 0.05) / 0.01 );
            //각 화폐 단위의 개수 출력.
            System.out.println(Q + " " + D + " " + NK + " " + P);
        }//for end

    }//main end
}//class end
