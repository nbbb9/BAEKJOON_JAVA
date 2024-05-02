package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class no07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = new ArrayList<>();
        List<Integer> countAry = new ArrayList<>();

        int j = 0;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }else{
                num.add(j, n);
                j++;
            }//if-else end
        }//while end
        br.close();
        for(int i = 0 ; i < num.size() ; i++){
            int count = 0;
            int checknum = num.get(i);
            for(int q = checknum+1 ; q <= 2*checknum ; q++ ){
                if(isPrime(q) == 1){//n부터 2n까지 반복하면서 소수가 존재한다면 count++
                    count++;
                }//if end
            }//for2 end
            countAry.add(i, count);
        }//for end

        for(int i = 0 ; i < countAry.size() ; i++){
            System.out.println(countAry.get(i));
        }

    }//main end
    public static int isPrime(long n){//소수일경우 1, 아닐경우 0
        if (n < 2){
            return 0;
        }//if else
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }//if end
        }//for end
        return 1;
    }//isPrime end
}//class end
