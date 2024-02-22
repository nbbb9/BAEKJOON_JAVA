package Step04_Baekjoon_Array;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //크기가 30인 배열 생성
        int[] arr = new int[30];

        for(int i=1; i<=28; i++) {
            //입력값과 인덱스번호를 비교해서 일치한다면,
            // 해당 인덱스에 1을 뺀 인덱스에 1을 넣는다.
            //입력값울 저장하는 변수 num
            int num = scan.nextInt();
            for(int j=0; j<=29; j++) {
                if(num == j) {
                    arr[j-1] = 1;
                }//if end
            }//for2 end
        }//for end

        for(int i=0; i<30; i++) {
            //배열의 값이 1이 아니고 0인 인덱스를 찾아서 출력한다.
            if(arr[i] != 1) {
                System.out.println(i+1);
            }//if end
        }//for end

    }//main end
}//class end
