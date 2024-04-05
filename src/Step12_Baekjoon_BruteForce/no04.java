package Step12_Baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        //N = 행 M = 열
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //검은색, 흰색의 정보를 담는 2차원 배열 chess
        boolean [][] chess = new boolean [N][M];

        for(int i = 0 ; i < N ; i++){
            String str = reader.readLine();
            for(int j = 0 ; j < M ; j++){
                if(str.charAt(j) == 'W'){
                    chess[i][j] = true;
                }else{
                    chess[i][j] = false;
                }//if-else end
            }//for2 end
        }//for end
        //수정해야할 타일의 개수를 계산하기 위한 변수 count
        int count = 0;
        //각 행의 첫번째 값(j==0)일 때는 위의 값과 비교하고 다음차례에 비교하면 되기때문에
        //j는 1부터 시작
        for(int i = 0 ; i < 8; i++){
            for(int j = 1 ; j < 8 ; j++){
                if( i == 0 ){//첫번째 행일 때
                    //만약 앞선값과 현재값이 같다면 count증가 후 현재 타일을 올바를 값으로 변경
                    if(chess[i][j] == chess[i][j-1]){
                        count++;
                        chess[i][j] = !chess[i][j];
                    }//if end
                }else if(i != 0 ){//첫번재 행이 아닐 때
                    //앞선 행의 첫번째 값과 현재 행의 첫번째 값이 같다면 올바른 색으로 변경
                    if(chess[i-1][0] == chess[i][0]){
                        count++;
                        chess[i][0] = !chess[i][0];
                    }//if end
                    if(chess[i][j] == chess[i][j-1]){
                        //만약 앞선값과 현재값이 같다면 count증가 후 현태 타일을 올바를 값으로 변경
                        count++;
                        chess[i][j] = !chess[i][j];
                    }//if end
                }//if-else end
            }//for2 end
        }//for end

        count = Math.min(count, 64-count);

        System.out.println(count);
    }//main end
}//class end
