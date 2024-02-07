package Step4.BAEKJOON_Array1;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //최댓값을 저장할 변수max
        int max = 0;
        //입력할 9개의 수를 저장할 배열 narray
        int narray[] = new int[9];
        //최댓값이 몇번째인지 계산하기위한 변수 count
        int count = 0;

        for(int i = 0; i < 9 ; i++){
            //9개의 수를 차례로 입력하고 배열에 저장함.
            int N = sc.nextInt();
            narray[i] = N;
        }//for end

        for(int i = 0 ; i < 9 ; i++){
            //배열 인덱스 0부터8까지 max값보다 해당 인덱스의 값이 크다면
            //max의 값에 해당값을 대입함.
            if( max < narray[i] ) {
                max = narray[i];
            }//if end
        }//for end

        for( int i = 0 ; i < 9 ; i++ ){
            //위에서 최댓값을 찾았기 때문에 인덱스 0부터 max값과 같은지 비교
            //다를때마다 count를 1씩 더함.
            //만약 같다면, break를 통해 for문을 빠져나감.
            if( max != narray[i] ){
                count++;
            }else{
                break;
            }//else end
        }//for end

        System.out.println(max);
        //count된 수는 최댓값이 있는 순번의 바로 전 까지이므로 1을 더함.
        System.out.println(count+1);

    }//main end
}//class end
