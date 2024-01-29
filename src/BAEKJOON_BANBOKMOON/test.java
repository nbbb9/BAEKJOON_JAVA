package BAEKJOON_BANBOKMOON;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N, A, B를 입력하세요. '/'는 제외하고 숫자만 입력하세요.");
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        System.out.println("A 배열의 값들을 입력하세요:");
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("B 배열의 값들을 입력하세요:");
        for(int i=0; i<N; i++) {
            B[i] = sc.nextInt();
        }

        int sumA = 0;
        int sumB = 0;

        for(int i=0; i<N; i++) {
            sumA += A[i];
            sumB += B[i];
        }

        System.out.println("결과는 다음과 같습니다:");
        System.out.println(sumA + " / " + sumB);
    }
}
