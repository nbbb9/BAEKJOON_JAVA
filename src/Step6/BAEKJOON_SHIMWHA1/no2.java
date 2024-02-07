package Step6.BAEKJOON_SHIMWHA1;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //보유한 체스의 개수를 입력받을 배열 chessary
        int [] chessary = new int[6];
        //공식적으로 정해진 체스말의 개수를 저장하는 배열 realchessary
        int [] realchessary = { 1, 1, 2, 2, 2, 8};
        //현재 보유한 체스 말 각각의 개수를 반복문을 통해 입력한다. 각 인덱스는 각 말의 순서
        for (int i = 0 ; i < chessary.length ; i++){
            chessary[i] = scan.nextInt();
        }//for end
        //각 말마다 공식적 개수와 현재 보유한 개수를 빼서 몇개가 필요하거나 더 있는지 계산하여 출력한다.
        for ( int i = 0; i < 6 ; i++ ){
            System.out.print(realchessary[i] - chessary[i] + " ");
        }//for end

    }//main end
}//class end
