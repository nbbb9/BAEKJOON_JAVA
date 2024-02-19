package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if( a+b+c != 180 ){
            System.out.println("Error");
        }else if( a==60 && b==60 && c==60 ){
            System.out.println("Equilateral");
        }else if( (a+b+c == 180) && (a==b || a==c || b==c) ){
            System.out.println("Isosceles");
        }else if( (a+b+c == 180) && (a!=b && a!=c && b!=c) ){
            System.out.println("Scalene");
        }

    }//main end
}//class end
