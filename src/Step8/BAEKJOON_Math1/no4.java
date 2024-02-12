package Step8.BAEKJOON_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no4 {
    //해당문제는 윗변의 점의 개수가 회사를 거듭할수록 몇개가 늘어나는지 규칙성을 찾으면 된다.
    //다음회자의 윗변의 점의 개수는 현재 윗변 점의 개수에 2를 곱한다음 1을 빼면 된다.
    //정사각형이므로 윗변의 점의 개수를 제곱하면 결과가 나온다.
    public static void main(String[] args) throws IOException {
        //BufferedReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //반복할 횟수를 입력받는 변수 N
        int N = Integer.parseInt(reader.readLine());
        //결과값을 저장할 변수 result
        int result = 0;
        //초기상태의 점개수.
        int first = 2;
        //초기상태까지 생각을 해야하므로 0부터 입력한 회차와 같을때까지 반복
        for(int i = 0  ; i <= N ; i++){
            //처음에는 2*2이므로 쉽게 4를 출력하도록 했다.
            if( i == 0 ){
                result = 2 * 2;
            }else{
                //초기값을 제외하고 뒤로갈수록 문제의 로직을 따라 진행하였다.
                first = ((first) * 2) - 1;
                result = first * first;
            }//else end
        }//for end
        //결과값 출력
        System.out.println(result);
    }//main end
}//class end
