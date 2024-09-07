package Step21_Baekjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no05 {
    static int n;
    static StringBuilder result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null){//파일의 끝 >> 입력이 들어오지 않을 때 까지
            n = Integer.parseInt(str);
            result = new StringBuilder();
            int len = (int) Math.pow(3, n);//pow는 제곱을 구하는 함수. 결과값이 실수인데 (int)를 써줌으로써 정수형으로 설정 가능.
            for(int i = 0 ; i < len ; i++){
                result.append("-");
            }//for end
            cantor(0, len);
            System.out.println(result);
        }//while end
    }//main end
    public static void cantor(int start, int size){
        //시작 인덱스 start, 문자열 사이즈 size.
        if(size == 1){
            return;//선의 길이가 1이면 종료.
        }//if end
        int newSize = size/3;//3등분 작업.
        for(int i = start + newSize ; i < start + 2 * newSize ; i++){
            result.setCharAt(i, ' ');//공백으로 변환하는 작업
        }//for end
        cantor(start, newSize);//3등분 한 문자열에서 첫번째 부분.
        cantor(start + 2 * newSize, newSize);//3등분한 문자열에서 세번째 부분.
    }//cantor end
}//class end