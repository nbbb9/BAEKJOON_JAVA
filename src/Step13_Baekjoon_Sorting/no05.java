package Step13_Baekjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }//for end
        reader.close();
        //System.out.println("Debug >>> " + list.toString());
        Collections.sort(list);
        //System.out.println("Debug >>> " + list.toString());
        for(int i = 0 ; i < list.size() ; i++){
            sb.append(list.get(i));
        }//for end

        System.out.println(sb);
    }//main end
}//class end
