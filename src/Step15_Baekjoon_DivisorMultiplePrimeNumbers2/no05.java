package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        for(long i = 0; i < n; i++) {
            long a = Long.parseLong(br.readLine());
            while(true){
                if(isPrime(a) == 0){
                    a++;
                }else{
                    System.out.println(a);
                    break;
                }//if-else end
            }//while end
        }//for end
        br.close();
    }//main end
    public static int isPrime(long n){//소수일경우 1, 아닐경우 0
        if (n < 2){
            //1은 약수가 될 수 없으므로 꼭 처리 해주어야하는 코드.
            return 0;
        }//if else
        //sqrt함수를 통해 제곱근을 구할 수 있음.
        //반복을 n의 제곱까지만 수행하는 이유는 만약 n이 어떤 수 a로 나누어진다면,
        //그 몫도 n을 나누는 수가 된다. 즉, n = a * b라고 할 때, a와 b 둘 중 하나는 반드시 n의 제곱근 이하이다.
        //왜냐하면, 만약 a와 b 모두 n의 제곱근보다 크다면, a*b는 n보다 커지게 되어, n = a * b라는 조건에 맞지 않게 되기 때문.
        //따라서, n의 약수를 찾을 때 굳이 n-1까지 모든 수를 확인할 필요가 없고, n의 제곱근까지만 확인.
        //만약 n의 제곱근까지 나누어떨어지는 수가 없다면, 그 이후의 수에서도 나누어떨어지는 수는 없다는 결론을 내릴 수 있다.
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }//if end
        }//for end
        return 1;
    }//isPrime end
}//class end