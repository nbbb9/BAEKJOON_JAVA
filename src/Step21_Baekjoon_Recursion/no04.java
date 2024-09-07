package Step21_Baekjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());//배열 A의 크기 N
        int K = Integer.parseInt(st.nextToken());//저장 횟수 K

        ArrayList<Integer> array = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " "); // 배열 A의 값을 읽기 위해 다시 초기화

        for(int i = 0 ; i < N ; i++){
            array.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

//        for(int i = 0 ; i < array.size() ; i++){
//            System.out.println(array.get(i));
//        }



    }//main end
}//class end