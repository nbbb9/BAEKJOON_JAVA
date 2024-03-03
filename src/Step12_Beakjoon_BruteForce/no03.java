package Step12_Beakjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no03 {
    static int a, b, c, d, e, f;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        //각 수를 입력받는 변수 6개 선언
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        //reader 종료
        reader.close();
        //각 최종 x, y값을 저장할 변수 선언
        int x = 0;
        int y = 0;
        //-999부터 999까지 반복하면서 모든 조건을 만족하는 x, y값 찾기
        //i는 x를, j는 y를 의미한다.
        for(int i = -999 ; i <= 999 ; i++){
            for(int j = -999 ; j <= 999 ; j++){
                //문제에 존재하는 식의 조건을 만족하면 해당값을 x, y에 저장하고 반복문 종료
                if( ((a*i)+(b*j)==c) && ((d*i)+(e*j)==f) ){
                    x = i;
                    y = j;
                    break;
                }//if end
            }//for2 end
        }//for end
        //결과값 출력
        System.out.println(x + " " + y);
    }//main end
}//class end
