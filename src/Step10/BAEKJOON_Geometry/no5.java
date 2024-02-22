package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //옥구슬의 개수를 입력받는 변수 N
        int N = Integer.parseInt(reader.readLine());
        //각 구슬의 위치를 저장하기위한 리스트 x,y
        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        //입력받은 옥구슬의 개수만큼 반복하며 각각의 위치를 입력받음.
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }//for end
        //가로, 세로길이를 받는 변수 width, height
        int width = getLength(x);
        int height = getLength(y);
        //두 변수를 곱하여 결과값 출력.
        System.out.println(width * height);
    }//main end
    public static int getLength(List<Integer> list){
    //각 x,y축의 최소 최대를 구해서 빼주면, 사각형의 가로, 세로 길이가 나온다.
    //그 값을 구해주는 메서드.
        //각 축의 최소, 최대값을 저장받을 변수 max, min.
        //우선 리스트의 첫번째 인덱스값으로 초기화
        int max = list.get(0);
        int min = list.get(0);
        //리스트의 길이(옥구슬의 개수)만큼 반복문 수행.
        //최대, 최소를 구한다.
        for(int i = 1; i < list.size() ; i++){
            if( min > list.get(i) ){
                min = list.get(i);
            }//if end
            if( max < list.get(i) ){
                max = list.get(i);
            }//if2 end
        }//for end
        //최대, 최소를 뺀 값을 반환. 각 축의 길이를 반환하는 것과 같다.
        return max - min;
    }//getLength method end
}//class end
