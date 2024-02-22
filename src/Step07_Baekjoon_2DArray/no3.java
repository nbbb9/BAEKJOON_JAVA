package Step07_Baekjoon_2DArray;

import java.io.*;

public class no3 {
    public static void main(String[] args) throws IOException {
        //BufferReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferWriter 객체 생성
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        //2차원 배열 myAry선언. 문제에서 최대 15개를 입력한다고 햇으니 5*15배열을 생성
        char [][] myAry = new char[5][15];

        //2중 for문을 통해 2차원배열에 값을 넣는다.
        //다만, 2번째 for문이 시작하기 전에 먼저 한줄을 읽어드리고
        //다음, 각 행에 따른 열에 읽어드린 문자열만큼 반복하면서 각 인덱스에
        //char형태로 값을 넣는다.
        for(int i  = 0 ; i < 5 ; i++){
            String str = reader.readLine();
            for(int q = 0 ; q < str.length() ; q++){
                myAry[i][q] = str.charAt(q);
            }//for2 end
        }//for end
        //세로로 값을 출력해야 하므로 열부터 먼저 for문에 대입한다.
        //열의 길이는 행마다 다르므로 myArt[0].length로 최대값을 둔다.
        for(int q = 0 ; q < myAry[0].length ; q++){
            //행은 5까지 이므로 5까지.
            for(int i = 0 ; i < 5 ; i++){
                //만약, 값이 존재하지 않는다면
                if( myAry[i][q] == 0){
                    //해당 반복문을 중단하고 다시 첫번째 for문으로 돌아가
                    //다음 열의 값을 순차로 읽는다.
                    continue;
                }
                //writer를 통한 값 출력
                writer.write(String.valueOf(myAry[i][q]));
            }
        }

        reader.close();
        //flush = 버퍼에 잔류하는 모든 문자열을 출력(버퍼를 비우는 역할)
        writer.flush();
        writer.close();

    }//main end
}//class end
