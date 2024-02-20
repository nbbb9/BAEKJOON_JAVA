package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no3 {
    public static void main(String[] args) throws IOException {

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

        int xtemp = Find(X);
        int ytemp = Find(Y);

        System.out.println(xtemp + " " + ytemp);

    }//main end

    public static int Find(List<Integer> list){//각 리스트에서 짝지어지지 않은 값을 찾기위한 메소드
        //리스트의 0번 인덱스의 값을 temp에 넣는다.
        int temp = list.get(0);
        //만약 0번 인덱스의 값이 1번인덱스의 값과 같다면,
        //temp에 2번인덱스의 값을 넣는다.
        if( list.get(0).equals(list.get(1))){
            temp = list.get(2);
        }else{//만약 0번인덱스의 값이 1번인덱스의 값과 다르다면,
            if(list.get(0).equals(list.get(2))){
                temp = list.get(1);
            }else {
                temp = list.get(0);
            }
        }
        return temp;
    }//method Find end

}//class end
