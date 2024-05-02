package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OLDno09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        br.close();
        List<Integer> windows = new ArrayList<Integer>();
        for(int i = 0 ; i < N ; i++){//맨 처음에 창문이 모두 닫혀있으므로 0으로 초기화
            windows.add(i, 0);
        }//for end

        for(int i = 1 ; i < windows.size() ; i++){//창문의 개수만큼 반복하면서
            for(int j = i ; j < windows.size() ; j+=i){//
                if(windows.get(j) == 0){
                    windows.set(j, 1);
                }else{
                    windows.set(j, 0);
                }
            }
        }

        int count = 0;

        for(int i = 0 ; i < windows.size() ; i++){
            if(windows.get(i) == 1){
                count++;
            }
        }

        System.out.println(count);

    }//main end
}//class end
