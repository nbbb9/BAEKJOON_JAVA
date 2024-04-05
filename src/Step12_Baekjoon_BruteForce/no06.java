package Step12_Baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        reader.close();
        // 총 주머니의 개수를 계산하여 저장할 변수 count
        int count = 0;
        //무한루프
        while(true){
            //만약 N이 5로 나누어 떨어지지 않고, 0보다는 클 때 3을 빼고 개수를 한개 늘린다.
            //3키로 주머니를 하나 들었다고 가정한다.
            if(N%5 == 0){
                //만약 5로 나누어떨어진다면, 나눈값과 이전까지의 count를 더하고 종료.
                System.out.println(N/5 + count);
                break;
            }else if(N<0){
                //만약 3으로 계속 빼다가 그 값이 5로 나누어떨어지지 않고 0보다 작아진다면
                //정확하게 나눌 수 없는 수 이므로 -1 출력 후 종료.
                System.out.println(-1);
                break;
            }//if-else
            N -= 3;
            count++;
        }//while end
    }//main end
}//class end
