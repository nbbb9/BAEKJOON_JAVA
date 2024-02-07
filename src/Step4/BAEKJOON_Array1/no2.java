package Step4.BAEKJOON_Array1;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //수열의 길이를 입력받는 변수 N
        int N = sc.nextInt();
        //수열의 각 값들과 크기를 비교할 값을 입력받는 변수 X
        int X = sc.nextInt();
        //배열 선언
        int intarray[] = new int[N];

        if( ((N < 1) || (N > 100000)) || ((X < 1) || (X > 100000)) ){
            //N,X입력 제한
            System.out.println("1부터 100000까지만 입력하세요.");
        }else{
            for(int i = 0 ; i < N ; i++){
                //입력한 N만큼 반복하면서, i가 0부터 N이 될 때까지 각 인덱스에 맞는값을 입력.
                intarray[i] = sc.nextInt();
            }//for end
        }//else end

        for(int i = 0 ; i < N ; i++){
            //N까지 반복문을 돌면서 0부터 N번까지의 각 인덱스의 값과
            //V가 같으면 count를 1씩 더함.
            if( X > intarray[i]){
                System.out.printf(intarray[i] + " ");
            }else{
                continue;
            }//else end
        }//for end

    }//main end
}//class end
