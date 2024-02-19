package Step10.BAEKJOON_Geometry;

import java.io.*;
import java.util.StringTokenizer;

public class no7 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(reader.readLine());

            //배열이 아닌 int형 변수 선언
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0&& b == 0 && c == 0){
                break;
            }

            if((a >= b+ c) || (b >= a+ c) || (c >= a+ b)){ //삼각형에 부합하지 않을 경우
                writer.write("Invalid\n");
            }else if(a ==b && b == c){ //세변이 같을 경우
                writer.write("Equilateral\n");
            }else if((a == b) || (a == c) || (b == c)){ //두변이 같을 경우
                writer.write("Isosceles\n");
            }else if((a != b) && (b != c) && (c != a)){ //세변이 전부 다를 경우
                writer.write("Scalene\n");
            }
        }
        reader.close();
        writer.flush();
        writer.close();

    }//main end
}//class end
