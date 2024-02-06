package BAEKJOON_BAEYULL;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //배열에 몇개의 정수를 저장할지 담는 변수
        int N = sc.nextInt();
        //반복문을 돌면서 입력값과 동일한 값이 몇개인지 저장하기 위한 변수.
        int count = 0;
        //입력받을 값들을 저장할 배열 선언
        int intarray[] = new int[N];
        if( N < 1 && N > 100 ){
            //N입력제한
            System.out.println("1~100까지만 입력하세요.");
        }else{
            for(int i = 0 ; i < N ; i++){
                //입력한 N만큼 반복하면서,
                // i가 0부터 N이 될 때까지 각 인덱스에 맞는값을 입력.
                intarray[i] = sc.nextInt();
            }//for end
        }//if end
        //갯수를 알고싶은 수를 입력하는 변수 선언
        int V = sc.nextInt();

        if( V < 1 && V > 100 ) {
            //V입력제한
            System.out.println("1~100까지만 입력하세요.");
        }else{
            for(int i = 0 ; i < N ; i++){
                //N까지 반복문을 돌면서 0부터 N번까지의 각 인덱스의 값과
                //V가 같으면 count를 1씩 더함.
                if( V == intarray[i]){
                    count++;
                }else{
                    continue;
                }//if end
            }//for end
        }//else end
        //count 출력
        System.out.println(count);

    }//main end
}//class end
