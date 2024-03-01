package Step12_Beakjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no03 {
    static int a, b, c, d, e, f;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        reader.close();

        int x = 0;
        int y = 0;

        for(int i = -999 ; i <= 999 ; i++){
            for(int j = -999 ; j <= 999 ; j++){
                if( ((a*i)+(b*j)==c) && ((d*i)+(e*j)==f) ){
                    x = i;
                    y = j;
                    break;
                }//if end
            }//for2 end
        }//for end

        System.out.println(x + " " + y);

    }//main end

}//class end
