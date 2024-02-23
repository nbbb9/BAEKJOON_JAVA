package Step07_Baekjoon_2DArray;

import java.util.Scanner;

public class no01 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //행의 개수를 입력받는 변수 N
        int N = scan.nextInt();
        //열의 개수를 입력받는 변수 M
        int M = scan.nextInt();
        //사용자가 입력한 값을 담는 배열 A, B
        int [][] A = new int[N][M];
        int [][] B = new int[N][M];
        //A, B를 더한 값을 담을 배열 C
        int [][] C = new int[N][M];
        //2차원 배열이므로 2중for문을 사용한다.
        //첫번째 for를 통해 행을 기준으로 삼고,
        //두번째 for를 통해 각 행에 들어갈 값들을 입력받는다.
        //A, B모두 동일하게 적용.
        for(int i = 0 ; i < N ; i++){
            for(int q = 0 ; q < M ; q++){
                A[i][q] = scan.nextInt();
            }//for2 end
        }//for end

        for(int i = 0 ; i < N ; i++){
            for(int q = 0 ; q < M ; q++){
                B[i][q] = scan.nextInt();
            }//for2 end
        }//for end
        //행렬은 같은 행렬의 번호끼리만 연산이 가능하다.
        //따라서, 2중for를 통해 C에 더한 값을 같은 위치에 담는다.
        for(int i = 0 ; i < N ; i++){
            for(int q = 0 ; q < M ; q++){
                C[i][q] = A[i][q] + B[i][q];
            }//for2 end
        }//for end
        //이제 연산한 값이 저장된 배열 C를 출력한다.
        for(int i = 0 ; i < N ; i++){
            for(int q = 0 ; q < M ; q++){
                System.out.print(C[i][q] + " ");
            }//for2 end
            //1행 모두 출력 후 줄바꿈
            System.out.println();
        }//for end

    }//main end
}//class end
