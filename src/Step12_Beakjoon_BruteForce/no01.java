package Step12_Beakjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        //N = 카드의 개수
        int N = Integer.parseInt(st.nextToken());
        //M = 리미트값(넘지말아야 할 수)
        int M = Integer.parseInt(st.nextToken());
        //카드에 적힌 수를 저장하는 리스트 myCard
        List<Integer> myCard = new ArrayList<Integer>();
        //줄을 바꿔 입력값을 받으므로 StringTokenizer객체 다시 생성
        st = new StringTokenizer(reader.readLine());
        //N만큼 카드의 수를 입력.
        for(int i = 0 ; i < N ; i++){
            int a = Integer.parseInt(st.nextToken());
            myCard.add(i, a);
        }//for end
        //reader 종료
        reader.close();
        //List에 값이 잘 들어갔는지 확인하기 위한 코드
//        for(int i = 0 ; i < N ; i++){
//            System.out.print(myCard.get(i) + " ");
//        }//for end
        //이전값을 저장할 변수 prev
        int prev = 0;
        //3중 for문을 통해 비교한다.
        //하나하나 모두 비교하지만 같은 경우의수는 발생하면 안되기 때문에 -2, -1을 수행.
        //마찬가지로 i+1, j+1도 곂치는 경우의 수를 발생시키지 않기위해.
        for(int i = 0 ; i < myCard.size()-2 ; i++){
            for(int j = i+1 ; j < myCard.size()-1 ; j++){
                for(int k = j+1 ; k < myCard.size() ; k++){
                    //합을 구할 변수 sum 선언. 비교를 할때마다 새롭게 더해야하므로 지역변수로 선언.
                    int sum = 0;
                    //3장의 카드의 합 sum에 저장.
                    sum += myCard.get(i) + myCard.get(j) + myCard.get(k);
                    //만약 더한값이 M과 같다면 최적의 조건이므로 출력하고 시스템 종료
                    if(sum == M){
                        System.out.println(sum);
                        System.exit(0);
                    }//if end
                    //만약 sum이 이전 경우의수(이전경우의 합)보다 크고 M보다 작다면 prev에 저장한다.
                    //반복문 마지막까지 M과 같은값이 나오지 않는다면 prev가 최적의 값
                    if(prev < sum && sum < M){
                        prev = sum;
                    }//if end
                }//for3 end
            }//for2 end
        }//for end
        //결과값 출력.
        System.out.println(prev);
    }//main end
}//class end
