package Step10_Baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        //세 막대의 길이를 입력받을 변수 3개
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        //3개중 최대 길이를 저장할 변수 max
        int max = 0;
        //최대길이를 제외한 나머지 두개의 길이를 저장할 변수 2개 선언
        int else1 = 0;
        int else2 = 0;
        //최대길이를 구하는 로직....
        if( a > b ){
            max = a;
            if( max > c ){
                else1 = b;
                else2 = c;
            }else{
                max = c;
                else1 = a;
                else2 = b;
            }//if-else2 end
        }else{
            max = b;
            if( max > c ){
                else1 = a;
                else2 = c;
            }else{
                max = c;
                else1 = a;
                else2 = b;
            }//if-else3 end
        }//if-else end
        //각 길이가 잘 들어갔는지 확인하는 코드
        //System.out.println(max + " " + else1 + " " +else2);
        //삼각형에 부합하지 않을 경우
        if( max >= else1 + else2 ){
            //삼각형의 가장 긴 길이가 나머지 두변의 합보다 작아야 하므로
            //나머지 두길이의 합에 1을 빼준값을 max에 저장.
            max = else1+else2-1;
            //결과 출력.
            System.out.println( max + else1 + else2 );
        }else{//삼각형의 조건에 부합한다면, 그냥 모두 더한값을 출력.
            System.out.println( a+b+c );
        }//if-else end
    }//main end
}//class end
