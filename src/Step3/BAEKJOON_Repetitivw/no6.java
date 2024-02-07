package Step3.BAEKJOON_Repetitivw;

import java.io.*;
import java.util.StringTokenizer;

public class no6 {
    public static void main(String[] args) throws IOException {
        //https://blog.naver.com/qbxlvnf11/221140609067
        //본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
        //입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때
        // 시간초과가 날 수 있다는 점이다.
        //Java를 사용하고 있다면, Scanner와 System.out.println 대신
        // BufferedReader와 BufferedWriter를 사용할 수 있다.
        // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
        //BufferReader를 쓰기위해선 throws IOExpertion을 꼭 추가해야한다.
        //버터리더는 입력값이 어떤 형태이든 우선 문자열로 입력받고 이를 나중에 정수,char형으로 변환하여 로직을 수행하는 메서드이다.
        //시용자의 입력을 수행하는 객체 reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //사용자의 출력을 수행하는 객체 writer
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        //수행할 테스트케이스의 횟수를 입력받는 변수 N
        //reader로 입력받은 값을 parseInt메서드를 통해 정수형으로 변환한다.
        int N = Integer.parseInt(reader.readLine());
        //테스트 케이스에서 주어지는 두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer 을 생성과 동시에 문자를 입력받는다.
        StringTokenizer st;
        //입력한 테스트케이스 만큼 반복 수행
        for (int i = 0; i < N; i++) {
            //위에서 설명한것 처럼 반복 1회 수행마다 토큰을 생성한다.
            st = new StringTokenizer(reader.readLine()," ");
            //write메서드를 통해 문자열을 입력받는다. 해당 문자열을 토큰 st마다 분리한다.(2개의 정수를 입력받아야 하므로)
            writer.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }//for end

        reader.close();
        //flush = 버퍼에 잔류하는 모든 문자열을 출력(버퍼를 비우는 역할)
        writer.flush();

        writer.close();

    }//main end
}//class end
