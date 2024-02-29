package Step12_Beakjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        //자연수 N이 몇자리 자연수인지 저장하는 변수 NLength
        int NLength = (int)(Math.log10(N)+1);
        //각 자리별로 0부터 9까지(가장 큰 자리수는 1부터 9까지)를 계산하기위해 자리수만큼의 배열 생성.
        int [] ary = new int[NLength];
        //배열의 값을 9로 채운다.(각 자리별로 가장 큰 수는 9이므로)
        for(int i = 0 ; i < NLength ; i++){
            ary[i] = 9;
        }//for end

        // 여기부터 로직 구현 아직 못함

    }//main end
}//class end
