package Step16_Baekjoon_StackCueDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //한 줄로 입력받기
        String input = br.readLine();
        //입력받은 문자열을 공백으로 분리하여 배열로 변환
        String[] line = input.split(" ");
        //대기줄
        Stack<Integer> tempLine = new Stack<>();
        //
        int temp = 0;
        //각 숫자를 스택에 추가
        for (String number : line) {
//            if(temp < number){
//
//            }
            tempLine.push(Integer.parseInt(number)); //문자열을 Int형으로 변환 후 스택에 추가
        }//for end




        br.close();
    }//main end
}//class end