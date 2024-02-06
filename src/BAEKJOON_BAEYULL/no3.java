package BAEKJOON_BAEYULL;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //수열의 길이를 입력받는 변수 N
        int N = sc.nextInt();
        //입력받을 수들을 저장하는 배열 선언
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            //입력한 N만큼 반복하면서,
            // i가 0부터 N이 될 때까지 순차적으로 값을 입력.
            array[i] = sc.nextInt();
        }//for end
        //max, min의 변수선언 위치가 중요하다.
        //위의 for문 앞에 선언할 경우 값이 0으로 초기화 되는데
        //그럼 아래의 for문에서 크기비교를 수행할 때 오류가 발생한다.
        //최댓값을 저장할 변수
        int max = array[0];
        //최솟값을 저장할 변수
        int min = array[0];

        for(int i = 0 ; i < N ; i++){
            //인덱스0부터 차례로 비교를 한다.
            // 만약, max값이 해당 인덱스값보다 작다면
            //해당 인덱스값을 max에 넣어준다.
            if( max < array[i] ){
                max = array[i];
            }//if end
        }//for end

        for(int i = 0 ; i < N ; i++){
            //인덱스 0부터 차례로 비교를 한다. 만약, min값이 해당 인덱스값보다 작다면
            //해당 인덱스값을 min에 넣어준다.
            if( min > array[i] ){
                min = array[i];
            }//if end
        }//for end
        //출력 형식에 맞게 최소값과 최대값을 출력한다.
        System.out.println(min +" "+ max);

    }//main end
}//class end
