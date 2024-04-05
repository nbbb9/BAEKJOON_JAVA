package Step13_Baekjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //우선 입력값을 String으로 입력받는다.
        String num = reader.readLine();
        reader.close();
        //문자열을 char형 배열로 변환한다.
        char[] numToAry = num.toCharArray();
        //numToAry의 값들을 int형으로 변환해 저장할 배열 선언
        int[] realAry = new int[numToAry.length];
        //numToAry의 값들은 아스키코드값이므로 각 인덱스의 값마다 '0'을 빼서 realAry에 저장.
        for(int i = 0 ; i < realAry.length ; i++){
            realAry[i] = numToAry[i] - '0';
        }//for end
        //오름차순 정렬
        Arrays.sort(realAry);
        //오름차순으로 정렬된 배열을 역순으로 출력하여 내림차순으로 출력한다.
        for(int i = realAry.length-1 ; i >= 0 ; i--){
            System.out.print(realAry[i]);
        }//for end
    }//main end
}//class end