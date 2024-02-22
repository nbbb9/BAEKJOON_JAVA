package Step07_Baekjoon_2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no4 {
    public static void main(String[] args) throws IOException {
        //BufferReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //가로 세로가 각각 100인 배열 생성. (x축 y축으로 생각하자)
        int [][]sqrAry = new int[100][100];
        //색종이의 개수를 입력받는 변수 N
        //입력값을 parseInt로 정수형으로 변환한다.
        int N = Integer.parseInt(reader.readLine());
        //StringTokenizer 객체 선언
        StringTokenizer st;
        //최종 넓이 계산을 위한 변수 area
        int area = 0;

        //색종이의 갯수만큼 x값과 y값을 입력받는다.
        for(int i = 0 ; i < N ; i++){
            //StringTokenizer객체를 생성하고 x,y값을 저장한다.
            st = new StringTokenizer(reader.readLine());
            //각 값들은 입력받고 정수형으로 변환한다.
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //x와 y값이 잘들어갔는지 테스트하기위한 코드
            //System.out.println(x + " " + y);
            //입력한 x값과 y값에 각각 10을 더한만큼의 공간에 1을 넣는다.
            //그럼, 해당 영역은 곂치더라도 1로 계속 유지된다.
            for(int q = x ; q < x + 10 ; q++){
                for(int w = y ; w < y + 10 ; w++){
                    sqrAry[w][q] = 1;
                }
            }
        }//for end

        //2차원배열에서 0부터 100까지 모든 인덱스를 돌면서
        //해당 값이 1이라면 면적(area)에 1을 더한다.
        for(int i = 0 ; i < 100 ; i++){
            for(int q = 0 ; q < 100 ; q++){
                if(sqrAry[i][q] == 1){
                    area++;
                }
            }
        }

        //2차원 배열에 값들이 잘 들어갔는지 테스트하기 위한 코드
//        for(int i = 0 ; i < 100; i++){
//            for(int q = 0 ; q < 100 ; q++){
//                System.out.print(sqrAry[i][q]);
//            }
//            System.out.println();
//        }

        //최종값 출력.
        System.out.println(area);

    }//main end
}//class end
