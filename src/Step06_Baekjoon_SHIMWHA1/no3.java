package Step06_Baekjoon_SHIMWHA1;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //증가하는 별찍기
        for(int i = 1; i <= N ; i++) {
            //앞의 빈칸 생성. 뒤의 빈칸은 생성할 필요 없음.
            //j를 0부터 N-i까지 수행.(빈칸의 개수)
            for(int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }//for end
            //각 줄은 i*2-1t과 같으므로, 한 줄을 생성할 때 마다 수행한다.
            for(int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }//for end
            //개행
            System.out.println();
        }//for end
        //감소하는 별찍기
        //N-1부터 수행하여 역순으로 진행한다.
        for(int i = N-1; i >= 0 ; i--) {
            //역순으로 진행하므로, 증가별찍기와 로직이 같다.
            for(int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }//main end
}//class end
