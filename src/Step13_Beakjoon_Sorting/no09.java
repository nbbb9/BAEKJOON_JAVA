package Step13_Beakjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        //단어(문자열)을 담은 배열 strAry
        List<String> strAry = new ArrayList<>();
        //각 단어의 길이를 담는 배열 strLength
        List<Integer> strLength = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            String str = reader.readLine();
            strAry.add(i, str);
            strLength.add(i, str.length());
        }//for end

        System.out.println("Debug >> ");
        for(int i = 0 ; i < N ; i++){
            System.out.print(strAry.get(i) + " " + strLength.get(i));
            System.out.println();
        }

        Collections.sort(strLength);

    }//main end
}//class end
