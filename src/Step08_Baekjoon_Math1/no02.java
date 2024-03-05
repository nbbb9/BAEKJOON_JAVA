package Step08_Baekjoon_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class no02 {
    public static void main(String[] args) throws IOException {
        //BufferwdReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer 객체 생성.
        StringTokenizer st = new StringTokenizer(reader.readLine());
        //입력받는 10진법수를 저장하는 변수 N
        int N = Integer.parseInt(st.nextToken());
        //어떤 진법을 사용할지 입력값을 저장하는 변수 B
        int B = Integer.parseInt(st.nextToken());
        //입력 마침.
        reader.close();
        //N과 B를 나눈 나머지의 아스키 코드값을 저장할 리스트
        List<Character> list = new ArrayList<>();
        //N이 0보다 클때까지는 몫이 0보다 클 경우이다.
        //10진수를 B진수로 변환하기 위해서는 10진수 N에 B를 나눈 몫을
        //계속 B로 나누고, 각각의 나머지를 역순으로 하고 이어붙인다.
        //여기서 만약 10보다 크다면 A부터 시작한다.
        while(N > 0){
            if( N % B >= 10){
                //만약 나머지가 10이상이면 알파벳 대문자로 이루어져야한다.
                //list에는 각 나머지의 아스키코드값이 들어가야 하므로
                //10을 빼고 'A'또는 65를 더해 해당하는 아스키코드값을 저장한다.
                list.add((char)(N%B-10+'A'));
            }else {
                //나머지가 10보다 작다면 숫자로 이루어져도 된다.
                //하지만 해당 값도 아스키코드값으로 이루어져야 하므로 '0'또는 48을 더한다.
                list.add((char) (N % B + '0'));
            }//if-else end
            //다음 반복은 N을 B로 나눈 값을 계속 나눠야 하므로 N에 N/B를 저장한다.
            N /= B;
        }//while end
        //list를 역순으로 바꿔주는 코드.
        Collections.reverse(list);
        //리스트의 모든항목을 간격없이 출력.
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i));
        }//for end
    }//main end
}//class end
