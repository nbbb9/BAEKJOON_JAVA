package Step13_Baekjoon_Sorting;

import java.io.*;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        //B의 범위. 주어진 조건에 맞게 크기가 10001인 배열을 생성(0 ~ 10000)
        //0부터 10000까지의 각 숫자가 입력으로 주어졌을 때,
        //해당 숫자가 몇 번 입력되었는지를 세기 위해 사용
        int[] count = new int[10001];
        for (int i = 0; i < N; i++) {
            //입력받은 숫자에 해당하는 인덱스의 값을 1 증가.
            count[Integer.parseInt(br.readLine())]++;
        }//for end
        //배열을 순회하며 0이 아닌 값을 가진 인덱스를 찾아 그 값을 출력
        for (int i = 1; i < 10001; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }//while end
        }//for end
        bw.close();
    }//main end
}//class end