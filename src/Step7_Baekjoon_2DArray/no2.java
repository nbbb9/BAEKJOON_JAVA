package Step7_Baekjoon_2DArray;

import java.io.*;
import java.util.StringTokenizer;

public class no2 {
    public static void main(String[] args) throws IOException {
        //BufferReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //2차원 배열 myAry선언. 크기는 9*9
        int [][] myAry = new int[9][9];
        //StringTokenizer객체 생성
        StringTokenizer st;
        //최댓값을 저장할 변수 max
        int max = 0;
        //최댓값의 행의 위치를 저장하는 변수 rowloc
        int rowloc = 0;
        //최댓값의 열의 위치를 저장하는 변수 columnloc
        int columnloc = 0;
        //2중 for문을 활용하여 9*9배열에 입력하는 값을 넣어준다.
        for(int i = 0 ; i < 9 ; i++){
            //한줄의 행을 입력할 때 마다입력받는 문자열의 분리를 하기위한 st를 생성한다.
            st = new StringTokenizer(reader.readLine(), " ");
            //1행의 9열까지 데이터를 넣기위한 for문
            for(int q = 0 ; q < 9 ; q++){
                //정수형 변수 N에 Tokenizer을 활용하여 간격별로 나누고,
                //그 값을 parseInt메서드를 통해 정수형으로 변환한다.
                int N = Integer.parseInt(st.nextToken());
                //변수 N을 각 배열에 넣어준다.
                myAry[i][q] = N;
            }//for2 end
        }//for end
        //배열에 값을 입력하는것과 똑같이 2중 for문을 통해 각 인덱스를 돌면서 최대값을 비교하고 그 값을
        //max에 저장한다. 저장되는 시점에 해당하는 행과 열도 저장한다.
        for(int i = 0 ; i < 9 ; i++){
            for(int q = 0 ; q < 9 ; q++){
                if(max < myAry[i][q]){
                    max = myAry[i][q];
                    rowloc = i;
                    columnloc = q;
                }
            }//for2 end
        }//for end
        //최대값을 출력하고, 줄바꿈 후 행과 열의 위치를 출력한다.
        //인덱스의 값은 물리적인 배열보다 1씩 작기때문에 +1을 수행한다.
        System.out.println(max);
        System.out.println( (rowloc+1) + " " + (columnloc+1) );

    }//main end
}//class end
