package Step12_Beakjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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

        int x = 0;
        int y = 0;
        int count = 1;
        for(int x1 = -999 ; x1 <= 999 ; x1++){
            for(int y1 = -999 ; y1 <= 999 ; y1++){
                for(int x2 = -999 ; x2 <= 999 ; x2++){
                    for(int y2 = -999 ; y2 <= 999 ; y2++){
                        count++;
                        System.out.println(count);
                        if( (a*x1)+(b*y1)==c && (d*x2)+(e*y2)==f ){
                            x = x1;
                            y = y1;
                            System.out.println(x + " " + y);
                            System.exit(0);
                        }//if end
                    }//for4 end
                }//for3 end
            }//for2 end
        }//for end

    }//main end

    public static List<int[]> find(int x, int y, int a, int b, int c){

        List<int[]> list = new ArrayList<>();

        while(true){
            for(int i = -999 ; i < 999 ; i++){
                for(int j = -999 ; j < 999 ; j++){
                    if( x == (c-(b*y))/a ){
                        list.add(new int[]{x,y});
                    }
                }
            }
        }
        return list;
    }

}//class end
