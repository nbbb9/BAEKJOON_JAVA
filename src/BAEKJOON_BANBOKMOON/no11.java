package BAEKJOON_BANBOKMOON;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        int A = 1;
        int B = 1;
        int C = A + B;
        int count = 0;
        int array[] = new int[count];

        do{
            A = sc.nextInt();
            B = sc.nextInt();
            C = A + B;
            array[count] = C;
            count++;
        }while(A != 0 && B != 0 );

        while( A != 0 && B != 0 ){
            A = sc.nextInt();
            B = sc.nextInt();
            C = A + B;
            array[count] = C;
            count++;
        }

        for(int i = 0 ; i < count ; i++){
            System.out.println(array[i]);
        }


    }
}