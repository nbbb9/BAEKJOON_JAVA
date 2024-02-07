package Step6.BAEKJOON_SHIMWHA1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int count = 0;

        int prev = 0;

        for(int i = 0 ; i < N ; i++){
            String str = scan.nextLine();
            int now = str.charAt(i);

            if( prev == now ){
                count++;
                prev = now;
            }//if end
        }//for end

        System.out.println(count);

    }//main end
}//class end
