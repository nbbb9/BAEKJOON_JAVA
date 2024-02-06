package BAEKJOON_BAEYULL;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //과목의 개수를 입력받는 변수 N
        int N = scan.nextInt();
        //새로운 점수는 실수형이 나올 가능성이 있다.
        //때문에 double형 배열을 선언한다.
        double[] array = new double[N];
        //조작된 점수의 총합을 구하기 위한 변수 sum
        double sum = 0;

        for(int i = 0; i < N ; i++){
            //우선 과목의 개수만큼 원래 점수를 입력하여 배열에 저장한다.
            array[i] = scan.nextDouble();
        }//for end
        //원래 점수의 최대값을 저장하기 위한 변수 max
        //배열의 첫번째 값을 최대값으로 우선 초기화한다.
        double max = array[0];
        //입력한 과목의 원래 점수 중 가장 큰 값이 어떤것인지
        //알아내기 위한 반복문.
        for(int i = 0 ; i < N ; i++){
            if ( max < array[i]){
                max = array[i];
            }//if end
        }//for end
        //이제 모든 점수를 최대값을 기준으로 조작한다.
        //이를 배열에 다시 넣는다.
        for(int i = 0 ; i < N ; i++){
                array[i] = array[i]/max*100;
        }//for end
        //첫 인덱스부터 끝인덱스까지 반복문을 돌면서 모두 합한다.
        for(int i = 0 ; i < N ; i++){
            sum = sum + array[i];
        }
        //평균을 저장하는 변수 avg
        double avg = sum / N;
        //avg 출력
        System.out.println(avg);

    }//main end
}//class end
