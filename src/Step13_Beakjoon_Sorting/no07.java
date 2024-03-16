package Step13_Beakjoon_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;//우선 선언만 해둔다.
        int N = Integer.parseInt(reader.readLine());
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            x.add(Integer.valueOf(st.nextToken()));
            y.add(Integer.valueOf(st.nextToken()));
        }//for end

        reader.close();

        System.out.println("Debug >>> ");
        for(int i = 0 ; i < N ; i++){
            System.out.print(x.get(i) + " ");
        }//for end
        System.out.println();
        for(int i = 0 ; i < N ; i++){
            System.out.print(y.get(i) + " ");
        }//for end
        System.out.println();

        //우선 x먼저 정렬
//        for(int i = 1 ; i < x.size() ; i++){
//            System.out.println("Debug >>> Start X sort " + i );
//            int temp = x.get(i-1);
//            if(x.get(i) < temp){
//                x.add(i-1, x.get(i));
//                x.add(i, temp);
//            }//if end
//        }//for end


        System.out.println("Debug >>> see XArray");
        for(int i = 0 ; i < N ; i++){
            System.out.print(x.get(i) + " ");
        }//for end

    }//main end
}//class end
