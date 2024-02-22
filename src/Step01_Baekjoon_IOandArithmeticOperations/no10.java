package Step01_Baekjoon_IOandArithmeticOperations;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int B_1 = B / 100;
        int B_E = B % 100;
        int B_2 = B_E / 10;
        int B_3 = B_E % 10;

        int c1 = A * B_3;
        int c2 = A * B_2;
        int c3 = A * B_1;
        int c4 = A * B;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
