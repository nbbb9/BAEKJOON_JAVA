package Step14_Baekjoon_SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no07 {
    public static void main(String[] args) throws IOException {
        //HashSet의 add, removeAll 메소드는 평균적으로 O(1) 시간 복잡도를 가지므로, 이 방법은 큰 데이터셋에서도 효율적으로 동작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //각각의 집합 원소의 개수를 입력받는 변수 sizeA, sizeB
        int sizeA = Integer.parseInt(st.nextToken());
        int sizeB = Integer.parseInt(st.nextToken());
        //HashSet은 요소의 존재여부를 평균 O(1)시간에 확인할 수 있어 해당 문제에서 매우 효과적이다.
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < sizeA; i++) {
            setA.add(st.nextToken());
        }//for end
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < sizeB; i++) {
            setB.add(st.nextToken());
        }//for end
        br.close();
        //setA와 setB의 대칭 차집합 구하기. 각 요소의 복사본은 만든다.
        Set<String> tempA = new HashSet<>(setA);
        Set<String> tempB = new HashSet<>(setB);
        //각 집합에서 다른 집합에 속하지 않은 요소들만 남기기 위해 removeAll()사용.
        tempA.removeAll(setB);//A-B
        tempB.removeAll(setA);//B-A
        //제거하고 남은 요소들의 개수를 더해 출력함으로써 대칭 차집합의 크기를 구할 수 있다.
        System.out.println(tempA.size() + tempB.size());
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        //각 집합의 크기를 입력받는 변수 sizeA & sizeB
//        int sizeA = Integer.parseInt(st.nextToken());
//        int sizeB = Integer.parseInt(st.nextToken());
//        int count = 0;
//        Map<Integer, String> mapA = new HashMap<>();
//        Map<Integer, String> mapB = new HashMap<>();
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < sizeA; i++) {
//            mapA.put(i, st.nextToken());
//        }//for end
//        //System.out.println(mapA);
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < sizeB; i++) {
//            mapB.put(i, st.nextToken());
//        }//for end
//        //System.out.println(mapB);
//        br.close();
//        for(int i = 0 ; i < sizeA; i++){
//            if(!mapB.containsValue(mapA.get(i))){
//                count++;
//            }//if end
//        }//for end
//        for(int i = 0 ; i < sizeB; i++){
//            if(!mapA.containsValue(mapB.get(i))){
//                count++;
//            }//if end
//        }//for end
//        System.out.println(count);
    }//main end
}//class end