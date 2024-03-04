package Step08_Baekjoon_Math1;

import java.io.*;
import java.util.StringTokenizer;

public class no01 {
    public static void main(String[] args) throws IOException {
        //10진수를 제외한 나머지 진수는 String으로 받아야 한다. -> int는 전부 10진수로 인식
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer 객체 생성.
        StringTokenizer st = new StringTokenizer(reader.readLine());
        //입력하는 수를 저장하는 변수 N
        String N = st.nextToken();
        //진법을 입력받는 변수 B
        int B = Integer.parseInt(st.nextToken());
        reader.close();
        //결과값을 저장할 변수 result
        int result = 0;
        //진법계산을 위해 곱할 수를 저장할 변수 cnt
        //진법계산 시 맨 오른쪽 (0승)은 무조건 1이므로 1로 초기화.
        int cnt = 1;
        //진수 계산은 오른쪽에서부터 수행해야하므로 맨 오른쪽부터 1씩 감소하면서 수행한다.
        //하지만, 인덱스로 따졌을 때 1씩 작아야하므로 N.length() - 1 과 0과 같을때 까지로 수행한다.
        for (int i = (N.length() - 1); i >= 0; i--) {
            //맨 오른쪽 인덱스부터 변환하고, 각각 비교해야 하므로 반복문을 수행할 때마다 초기화한다.
            char c = N.charAt(i);
            //만약 입력값이 'A' 와 'Z'사이일 경우
            if( c >= 'A' && c <= 'Z' ){
                //아스키코드로 계산하지않고 정수형으로 계산하기위해 'A'를 빼고 문제에서 주어진 10을 더해 36진법중 어떤 수인지 구한다.
                //그다음 36의 n승을 곱한 후 result에 저장한다.
                result += ( c - 'A' + 10 ) * cnt;
            }else{
                //char형을 int형으로 보면 아스키코드값이 나오므로
                //'0' 혹은 48을 빼주어야 원하는 값이 나온다
                result += ( c - '0' ) * cnt;
            }//else end
            //진법계산은 오른쪽에서 왼쪽으로 갈 때 마다 0승, 1승, 2승...의 방식으로 증가한다.
            //때문에 아래는 1 / 36 / 36*36 / 36*36*36 .......을 수행하기 위한 코드이다.
            cnt *= B;
        }//for end
        //결과값 출력
        System.out.println(result);

    }//main end
}//class end
