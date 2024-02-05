package BAEKJOON_SHIMWHA1;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] chessary = new int[6];
        int [] realchessary = { 1, 1, 2, 2, 2, 8};

        for (int i = 0 ; i < chessary.length ; i++){
            chessary[i] = scan.nextInt();
        }//for end

        for ( int i = 0; i < 6 ; i++ ){
            System.out.print(realchessary[i] - chessary[i] + " ");
        }//for end

    }//main end
}//class end
