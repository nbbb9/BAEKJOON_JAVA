package Step04_Baekjoon_Array;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //바구니 개수 입력 변수 N
        int N = scan.nextInt();
        //회차 입력 변수 M
        int M = scan.nextInt();
        //배열 선언. N만큼의 크기를 가진다.
        int[] array = new int[N];

        for(int i = 0 ; i < N ; i++){
            //인덱스 0부터 N까지 순차적으로 값을 입력한다.
            //인덱스보다 1큰값이 들어가야하므로 +1을 해준다.
            array[i] = i+1;
        }//for end

        for(int q = 0 ; q < M ; q++){
            //0부터 M까지 회차 진행.
            //첫번째 바구니 i와 j를 입력한다.
            //인덱스와 바구니 번호를 맞추기 위해 -1을 수행.
            int i = scan.nextInt() - 1;
            int j = scan.nextInt() - 1;

            while (i < j) {
                //temp라는 일시적 변수를 만들어 앞의 값을 담고 뒤의 값을 받고, temp값을 뒤 인덱스에 전달한다.
                int temp = array[i];
                //i+1번째 인덱스에 j번째 인덱스의 값을 넣는다.
                array[i++] = array[j];
                //j-1번째 인덱스에 i번째 인덱스를 넣는다.
                array[j--] = temp;
            }//while end

        }//for end

        for(int i = 0 ; i < N ; i++){
            //0번 인덱스 부터 차례로 배열을 출력한다.
            System.out.print(array[i] + " ");
        }//for end

    }//main end
}//class end
