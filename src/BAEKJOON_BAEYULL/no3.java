package BAEKJOON_BAEYULL;

import java.util.Scanner;

public class no3 {
    //왜 막히는지 모르겠음.
    //배열에 수를 입력할 때 입력한 수 보다(배열의 크기보다) 더 많은 수가 들어갈 수 있음.
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //수열의 길이를 입력받는 변수 N
        int N = sc.nextInt();
        //입력받을 수들을 저장하는 배열 선언
        int intarray[] = new int[N];
        //최댓값을 저장할 변수
        int max = 0;
        //최솟값을 저장할 변수
        int min = 0;

        if( N < 1 || N > 1000000){
            System.out.println("1부터 1000000까지만 입력하세요.");
        }else {
            for (int i = 0; i < N; i++) {
                //입력한 N만큼 반복하면서, i가 0부터 N이 될 때까지 순차적으로 값을 입력.
                intarray[i] = sc.nextInt();
                if (intarray[i] < -1000000 || intarray[i] > 1000000) {
                    System.out.println("-1000000부터 1000000까지만 입력하세요.");
                }
            }
        }

        for(int i = 0 ; i < N ; i++){
            //인덱스0부터 차례로 비교를 한다. 만약, max값이 해당 인덱스값보다 작다면
            //해당 인덱스값을 max에 넣어준다.
            if( max < intarray[i] ){
                max = intarray[i];
            }
        }

        for(int i = 0 ; i < N ; i++){
            //인덱스 0부터 차례로 비교를 한다. 만약, min값이 해당 인덱스값보다 작다면
            //해당 인덱스값을 min에 넣어준다.
            min = intarray[i];
            if( min > intarray[i] ){
                min = intarray[i];
            }
        }

        System.out.printf("%d %d", min, max);

    }
}
