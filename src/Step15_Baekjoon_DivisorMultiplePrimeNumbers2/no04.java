package Step15_Baekjoon_DivisorMultiplePrimeNumbers2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> tree = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            tree.add(Integer.parseInt(br.readLine()));
        }//for end
        br.close();

        int distgcd = 0;//가로수 간격의 최대 공약수를 저장하는 변수

        for(int i = 0 ; i < N-1 ; i++){
            int distance = tree.get(i+1) - tree.get(i);
            distgcd = gcd(distance, distgcd);//가로수 간격의 최대 공약수
        }//for end
        //(streetTree[N-1]-streetTree[0])/gcd은 간격의 수니까
        //가로수의 나무의 개수를 구하려면 간격의 수에서 + 1을 해야한다.
        //현재 설치된 나무의 수를 빼야 추가로 설치해야할 가로수의 수를 구할 수 있다.
        System.out.println( (tree.get(N-1)-tree.get(0))/distgcd+1 - (tree.size()) + "" );
    }//main end
    // 유클리드 호제법으로 최대공약수를 구하는 메소드 >> 가장 기본적인 형태의 구현방식
    public static int gcd(int a, int b) {
        while (b != 0) {//b가 0이 될 때까지
            int r = a % b;//a를 b로 나눈 나머지 r을 구한다.
            a = b;//b의 값을 a에 할당한다.
            b = r;//r의 값을 b에 할당한다.
        }//while end
        return a;//b가 0이 되었을 때, a는 최대공약수가 된다.
    }//gcd end
}//class end