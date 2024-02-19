package Step10.BAEKJOON_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(reader.readLine());

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }

//        System.out.println(x);
//        System.out.println(y);

        int width = getLength(x);
        int height = getLength(y);

        System.out.println(width * height);

    }//main end

    public static int getLength(List<Integer> list){
        int max = list.get(0);
        int min = list.get(0);

        for(int i = 1; i < list.size() ; i++){
            if( min > list.get(i) ){
                min = list.get(i);
            }
            if( max < list.get(i) ){
                max = list.get(i);
            }
        }

        return max - min;
    }//getLength method end

}//class end
