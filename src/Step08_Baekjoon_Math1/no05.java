package Step08_Baekjoon_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no05 {
    //결국 하나의 외곽으로 나갈 때가 1회 지나는 것이다.
    //처음 1번방부터 화차를 시작한다.
    //2부터 6개의 숫자만큼 외곽의 크기(개수)가 증가한다.
    //1 >> 6 >> 12 >> 18 >> 24 ......
    //각 외곽의 최대 숫자는 7, 19, 37, 61이다.
    public static void main(String[] args) throws IOException {
        //BuffredReader객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        //몇번째 방인지 게산하기 위한 변수 count
        int count = 1;
        //각 외곽의 최소값을 저장하는 변수 edgeMin
        int edgeMin = 2;
        //만약 N이 1이라면 첫번째 방에서 멈추므로 1출력 후 종료.
        if (N == 1) {
            System.out.println(1);
        } else {
            //N이 1보다 크다면 N이 각 외곽의 최소값(edgeMin)보다 작을 동안
            //외곽의 최소값은 각 회차에 6을 곱한만큼 커지므로 edgeMin += (6 * count); 수행
            //그리고 count++를 진행하여 몇번째 외곽인지 계산.
            while (edgeMin <= N) {
                edgeMin += (6 * count);
                count++;
            }//while end
            //결과값 출력
            System.out.println(count);
        }//if-else end
    }//main end
}//class end
