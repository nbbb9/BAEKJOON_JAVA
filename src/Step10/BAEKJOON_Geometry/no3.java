package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no3 {
    //왜 틀리는지 모르겠음.
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            X.add(x);
            Y.add(y);
        }
        reader.close();

//        System.out.println(X);
//        System.out.println(Y);

        int xtemp = Find(X);
        int ytemp = Find(Y);

        System.out.println(xtemp + " " + ytemp);

    }//main end

    public static int Find(List<Integer> list){
        int temp = list.get(0);
        if( list.get(0) == list.get(1) ){
            temp = list.get(2);
        }else{
            if( list.get(0) == list.get(2) ){
                temp = list.get(1);
            }else{
                temp = list.get(0);
            }
        }
        return temp;
    }//method Find end

}//class end
