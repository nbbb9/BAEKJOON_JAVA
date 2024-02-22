package Step10_Baekjoon_Geometry;

import java.io.*;
import java.util.StringTokenizer;

public class no7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        //0,0,0이 입력될 때 까지 무한루프
        while(true) {
            //StringTokenizer 객체 생성
            StringTokenizer st = new StringTokenizer(reader.readLine());
            //3변의 길이를 입력받을 변수 3개 선언.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            //만약 입력값이 모두 0이라면 반복문 종료
            if(a == 0&& b == 0 && c == 0){
                break;
            }//if end
            //삼각형에 부합하지 않을 경우
            if((a >= b+ c) || (b >= a+ c) || (c >= a+ b)){
                writer.write("Invalid\n");
            }else if(a ==b && b == c){//세변이 같을 경우
                writer.write("Equilateral\n");
            }else if((a == b) || (a == c) || (b == c)){//두변이 같을 경우
                writer.write("Isosceles\n");
            }else if((a != b) && (b != c) && (c != a)){//세변이 전부 다를 경우
                writer.write("Scalene\n");
            }
        }//while end
        reader.close();
        writer.flush();
        writer.close();
        //- flush() : FileWriter 내부 버퍼의 내용을 파일에 writer합니다.
        // flush()를 호출하지 않는다면 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황이 나올 수 있습니다.
        //- close() : FileWriter는 스트림을 이용하여 파일의 내용을 읽어들입니다.
        //이때 close()를 호출하여 스트림을 닫으면 그 스트림을 다시 이용하여 파일에 쓰는 것이 불가능합니다.
        //파일은 파일시스템이나 기타 다른 곳에 있으므로 이 내용을 스트림으로 읽어 들이는데 메모리를 소모합니다.
        //작업이 끝나면 close()를 호출하여 스트림을 닫아 종료된 작업에 대해 메모리를 확보해야 합니다.
    }//main end
}//class end
