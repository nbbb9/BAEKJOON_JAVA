package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no01 {
    static int recursive,  dp; //재귀함수, 동적프로그래밍의 실행 횟수 저장 변수
    static int[] f; //동적 프로그래밍에서 사용하는 의사코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f = new int[n]; //동적 프로그래밍에서 사용하는 배열 초기화
        br.close();
        //각 함수 카운트 변수 초기화
        recursive = 0;
        dp = 0;
        fib(n);
        fibonacci(n);
        System.out.println(recursive + " " + dp);
        //System.out.println(fib(n) + " " + fibonacci(n));
    }//main end
    static int fib(int n){//피보나치 수 재귀 호출 코드
        if(n == 1 || n == 2){
            recursive++;//F(1)또는F(2) 호출 시 카운트 증가.
            return 1;
        }else{
            return (fib(n-1) + fib(n-2));
        }//if-else end
    }//fib end
    static int fibonacci(int n){//피보나치 수 동적 프로그래밍 코드
        f[0] = 1;//F(1)
        f[1] = 1;//F(2)
        for(int i = 2; i < n; i++){
            dp++;//반복 횟수 카운트
            f[i] = f[i-1] + f[i-2];//동적 프로그래밍 계산
        }//for end
        return f[n-1];//배열은 0부터 시작하므로
    }//fibonacci end
}//class end