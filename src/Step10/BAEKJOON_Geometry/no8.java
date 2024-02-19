package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = 0;
        int else1 = 0;
        int else2 = 0;

        if( a > b ){
            max = a;
            if( max > c ){
                else1 = b;
                else2 = c;
            }else{
                max = c;
                else1 = a;
                else2 = b;
            }//sec1 end
        }else{
            max = b;
            if( max > c ){
                else1 = a;
                else2 = c;
            }else{
                max = c;
                else1 = a;
                else2 = b;
            }
        }
        //System.out.println(max + " " + else1 + " " +else2);

        //삼각형에 부합하지 않을 경우
        if( max >= else1 + else2 ){
            max = else1+else2-1;
            System.out.println( max + else1 + else2 );
        }else{
            System.out.println( a+b+c );
        }

    }//main end
}//class end
