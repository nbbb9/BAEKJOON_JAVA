package BAEKJOON_BAEYULL;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //바구니 개수
        int N = sc.nextInt();
        //공을 넣을 횟수
        int M = sc.nextInt();
        //i = 시작 바구니 번호 j = 마지막 바구니 번호 k = 넣을 공번호
        int i, j, k;
        //첫번째 바구니 번호를 담을 배열 생성
        int[] iarray = new int[M];
        //마지막 바구니 번호를 담을 배열 생성
        int[] jarray = new int[M];
        //각 회차마다 넣을 공의 번호를 담을 배열 생성
        int[] karray = new int[M];
        //최종적으로 바구니에 담길 공들의 번호를 담는 배열
        int[] mainarray = new int[N];
        //dowhile 문에서 횟수 증가를 위해 선언
        int x = 0;

        if( (N < 1 || N > 100) || (M < 1 || M > 100)){
            //입력제한
            System.out.println("N과 M은 1부터 100까지만 입력하세요.");
        }//if end

        do{
            //i,j,k를 입력받음.
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            if( (i < 1 || i > j) || (j > N) && (k < 1 || k > N) ){
                //i,j,k 범위 제한
                System.out.println("범위가 잘못입력되었습니다.");
                //만약 잘못 입력했으면 시스템 종료
                System.exit(0);
            }
            //i,j,k 값들을 담는 배열
            iarray[x] = i;
            jarray[x] = j;
            karray[x] = k;
            //반복문 1회 시도 시 x값 증가.
            x++;
        }while( x != M );//do-while end

        for(int y = 0 ; y < M ; y++){
            //시작하는 바구니 번호 = for문의 조건식으로 사용하기 위해 변수선언
            int i_ary = iarray[y] - 1;
            //마지막 바구니 번호 = for문의 조건식으로 사용하기 위해 변수선언
            int j_ary = jarray[y] - 1;
            //각 첫번째 바구니와 마지막 바구니까지  y값을 넣도록 설정
            for(int z = i_ary ; z <= j_ary ; z++){
                mainarray[z] = karray[y];
            }//for2 end

        }//for end

        for(int v = 0 ; v < N ; v++){
            //바구니에 담긴 수들을 인덱스 0부터 크기까지 출력
            int num = mainarray[v];
            System.out.print(mainarray[v] + " ");
        }//for end

    }//main end
}//class end
