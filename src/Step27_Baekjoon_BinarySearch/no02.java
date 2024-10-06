package Step27_Baekjoon_BinarySearch;

import java.io.*;
import java.util.*;

public class no02 {
    static int[] Nary;
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Nary = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            Nary[i] = Integer.parseInt(st.nextToken());
        }//for end

        Arrays.sort(Nary);//이분탐색을 위한 정렬

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            int a = count(Integer.parseInt(st.nextToken()));
            sb.append(a).append(" ");
        }//for end

        br.close();

        System.out.println(sb);
    }//main end
    public static int count(int key) {
        int start = 0;
        int end = Nary.length - 1;

        //key의 첫 번째 위치 찾기
        int first = -1;
        while(start <= end){
            int mid = (start + end) / 2;

            if(key > Nary[mid]){
                start = mid + 1;
            }else if (key < Nary[mid]){
                end = mid - 1;
            }else{
                first = mid; // 찾은 위치를 기록
                end = mid - 1; // 첫 번째 위치를 찾기 위해 왼쪽 탐색
            }//if-else end
        }//while end

        start = 0;
        end = Nary.length - 1;//시작과 끝을 다시 초기화 해야함.

        //key의 마지막 위치 찾기
        int last = -1;
        while(start <= end){
            int mid = (start + end) / 2;

            if(key > Nary[mid]){
                start = mid + 1;
            }else if(key < Nary[mid]){
                end = mid - 1;
            }else{
                last = mid;//찾은 위치를 기록
                start = mid + 1;//마지막 위치를 찾기 위해 오른쪽 탐색
            }//if-else end
        }//while end

        //key가 존재하지 않으면 0 반환
        if(first == -1 || last == -1){
            return 0;
        }//if end

        //key의 개수는 last - first + 1
        return last - first + 1;
    }//count end
}//class end