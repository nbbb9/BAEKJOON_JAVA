package Step9.BAEKJOON_DivisorMultiplePrimeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //무한루프를 위해 while문 안에 true를 사용한다.
        while(true){
            StringTokenizer st = new StringTokenizer(reader.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if( x == 0 && y == 0 ){
                System.exit(0);
            }//if end

            if( x < y ){
                if( y % x == 0 ){
                    System.out.println("factor");
                }else{
                    System.out.println("neither");
                }
            }else{
                if( x % y == 0 ){
                    System.out.println("multiple");
                }else{
                    System.out.println("neither");
                }
            }

        }//while end
    }//main end
}//class end
