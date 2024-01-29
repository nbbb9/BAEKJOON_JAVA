package BAEKJOON;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A,B,C;
        String str = sc.nextLine();
        String[] numbers = str.split(" ");
        A = Long.parseLong(numbers[0]);
        B = Long.parseLong(numbers[1]);
        C = Long.parseLong(numbers[2]);
        System.out.println(A+B+C);
    }
}
