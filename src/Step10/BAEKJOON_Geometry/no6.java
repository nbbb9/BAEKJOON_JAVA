package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //3개의 각도를 입력받아 저장할 변수 선언.
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        //만약 세 각도의 합이 180이 아니라면 삼각형이 아니다.
        if( a+b+c != 180 ){
            System.out.println("Error");
        //만약 세 각의 크기가 모두 60이면 정삼각형
        }else if( a==60 && b==60 && c==60 ){
            System.out.println("Equilateral");
        //만약 두 각도의 크기만 같다면 직각삼각형
        }else if((a==b || a==c || b==c) ){
            System.out.println("Isosceles");
        //3개의 각이 모두 다르다면
        }else if((a!=b && a!=c && b!=c) ){
            System.out.println("Scalene");
        }//else-if end
    }//main end
}//class end
