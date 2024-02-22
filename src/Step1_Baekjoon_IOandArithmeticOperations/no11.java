package Step1_Baekjoon_IOandArithmeticOperations;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //우선 문자열로 값을 입력받는다.
        String str = sc.nextLine();
        //입력받은 문자를 numbers라는 배열에 담는데, split메서드를 사용해서 " "(빈칸)을 기준으로 나눈다.
        String[] numbers = str.split(" ");
        //나누고 나면 0부터 2번 인덱스에 각각의 값들이 들어가는데, 이를 parselong메서드를 사용하여 Long으로 변환한다.
        long A = Long.parseLong(numbers[0]);
        long B = Long.parseLong(numbers[1]);
        long C = Long.parseLong(numbers[2]);
        //3개의 값을 더한다.
        System.out.println(A+B+C);
    }
}
