package Step23_Baekjoon_DynamicPlanningMethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no02 {
    //세 변수 중 20이 넘어가게 되면 w(20,20,20)을 호출하고,
    //0 이하일 경우는 1을 반환하기 때문에
    //각 배열의 크기가 21을 넘기지 않는다.
    static int[][][] dp = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == -1 && b == -1 && c == -1){
                break;//세 변수가 모두 -1이면 종료
            }//if end
            sb = new StringBuilder();//한줄의 입력마다 sb객체 생성.
            sb.append("w("+ a + ", " + b + ", " + c + ") = ").append(w(a,b,c));
            System.out.println(sb);
        }//while end
    }//main end
    static int w(int a, int b, int c){
        if(inRange(a, b, c) && dp[a][b][c] != 0){//이미 계산되어 저장되어있는 경우 해당 값을 바로 반환
            return dp[a][b][c];
        }//if end
        if(a <= 0 || b <= 0 || c <= 0){
            return 1;
        }else if(a > 20 || b > 20 || c > 20){
            return dp[20][20][20] = w(20,20,20);
        }else if(a < b && b < c){
            return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }else{
            return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        }//if-else end
    }//w end
    static boolean inRange(int a, int b, int c) {
        //배열을 참조하려 할 때 a, b, c중 하나라도 범위 밖의 수가 나올 수 있기 때문에 이를 체크해주기 위한 함수.
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }//inRange end
}//class end