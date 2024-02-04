package BAEKJOON_BAEYULL;

import java.util.Arrays;
import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        double[] array = new double[N];
        double sum = 0;

        for(int i = 0; i < N ; i++){
            array[i] = scan.nextDouble();
        }

        double max = array[0];

        for(int i = 0 ; i < N ; i++){
            if ( max < array[i]){
                max = array[i];
            }
        }

        for(int i = 0 ; i < N ; i++){
                array[i] = array[i]/max*100;
        }

        for(int i = 0 ; i < N ; i++){
            sum = sum + array[i];
        }

        double avg = sum / N;
        System.out.println(avg);

    }
}
