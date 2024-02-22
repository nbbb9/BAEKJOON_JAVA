package Step3_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //입력받을 수를 저장하는 변수n
        int n = sc.nextInt();
        //반복문을 통해 더해질 값을 저장하는 변수 sum
        int sum = 0;
        //1부터 n까지 sum = sum + i를수행한다.
        // sum은 계속적으로증가.
        for(int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println( sum );

    }
}
