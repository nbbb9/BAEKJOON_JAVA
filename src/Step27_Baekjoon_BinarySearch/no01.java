package Step27_Baekjoon_BinarySearch;

import java.io.*;
import java.util.*;
//https://st-lab.tistory.com/261 << 참고 블로그
public class no01 {
    public static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }//for end

        Arrays.sort(A);//이분탐색을 위해 정렬은 필수.

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){//찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0){//4번째 줄 입력을 굳이 배열로 만들필요 없이, 하나의 입력마다 판단.
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }//if-else end
        }//for end
        br.close();
        System.out.println(sb);
    }//main end

    public static int binarySearch(int key){
        int start = 0;//탐색 범위의 왼쪽 끝 인덱스
        int end = A.length - 1;//탐색 범위의 오른쪽 끝 인덱스

        while(start <= end){//start가 end보다 커지기 전까지 반복한다.
            int mid = (start + end) / 2;//중간위치(mid)를 구한다.
            if(key < A[mid]){//1. key값이 mid의 값보다 작을 경우
                end = mid - 1;
            }else if(key > A[mid]){//2. key값이 mid의 값보다 클 경우
                start = mid + 1;
            }else{//3. key값과 중간 위치의 값이 같을 경우
                return mid;
            }//if-else end
        }//while end

        return -1;//찾고자 하는 값이 존재하지 않을 경우
    }//binarySearch end
}//class end