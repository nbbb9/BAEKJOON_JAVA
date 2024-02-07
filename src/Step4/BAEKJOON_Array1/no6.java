package Step4.BAEKJOON_Array1;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //바구니 개수를 입력받는 변수 N
        int N = sc.nextInt();
        //공 교환 횟수를 입력받는 변수 M
        int M = sc.nextInt();
        //최종적으로 바구니에 담길 공들의 번호를 담는 배열 mainarray
        int[] mainarray = new int[N];

        for(int i = 1 ; i <= N ; i++){
            //각 바구니의 번호에 맞는 공을 넣는 방식
            mainarray[(i-1)] = i;
        }//for end

        for(int k = 0 ; k < M ; k++){
            //교환 횟수(M)만큼 입력
            //i =바구니 번호1 j = 바구니 번호2
            int i = sc.nextInt();
            int j = sc.nextInt();
            //i 번째 바구니의 값을 저장하는 변수 t
            //배열의 인덱스와 바구니 번호는 1씩 차이가 나므로 -1을 수행함.
            int t = mainarray[(i-1)];
            //앞 바구니에 뒷 바구니의 값을 넣는다.
            mainarray[(i-1)] = mainarray[(j-1)];
            //j번째 바구니에 앞바구니의 값 t를 넣는다.
            mainarray[(j-1)] = t;
        }//for end

        for(int i = 0 ; i < N ; i++){
            //배열 출력
            System.out.print(mainarray[i] + " ");
        }//for end

    }//main end
}//class end
