package Step10_Baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no03 {
    public static void main(String[] args) throws IOException {
        //== 연산자와 equals메서드의 차이를 정확히 알자.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //각 입력의 첫번째, 두번째값을 각각 저장할 리스트 X, Y
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        //세점의 좌표를 찍기위해 3번의 반복문 실행. 각각의 값을 리스트에 저장.
        for(int i = 0  ; i < 3 ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            X.add(x);
            Y.add(y);
        }//for end
        //입력 프로세스 종료
        reader.close();
        //각 리스트에 값이 올바르게 들어갔는지 테스트하기 위한 코드
        //System.out.println(X);
        //System.out.println(Y);
        //각각의 변수에 Find메서드를 통한 값 저장
        int xtemp = Find(X);
        int ytemp = Find(Y);
        //결과값 출력
        System.out.println(xtemp + " " + ytemp);
    }//main end
    public static int Find(List<Integer> list){//각 리스트에서 짝지어지지 않은 값을 찾기위한 메소드
        //리스트의 0번 인덱스의 값을 temp에 넣는다.
        int temp = list.get(0);
        //만약 0번 인덱스의 값이 1번인덱스의 값과 같다면,
        //temp에 2번인덱스의 값을 넣는다.
        if( list.get(0).equals(list.get(1))){
            temp = list.get(2);
        }else{//만약 0번인덱스의 값이 1번인덱스의 값과 다르다면, 2가지의 경우의 수 발생
            if(list.get(0).equals(list.get(2))){
                //만약, 0번인덱스의 값과 2번인덱스의 값이 같다면, 1번 인덱스의 값을 반환
                temp = list.get(1);
            }else {
                //0번인덱스와 2번인덱스가 다르다면, 0번 인덱스의 값 반환
                temp = list.get(0);
            }//if-else2 end
        }//if-else end
        return temp;
    }//method Find end
}//class end
