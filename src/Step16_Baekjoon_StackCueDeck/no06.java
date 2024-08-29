package Step16_Baekjoon_StackCueDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class no06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        //Queue가 아닌 LinkedList로 해야 시간초과 발생 안함.
        LinkedList<Integer> queue = new LinkedList<>();
        while(N != 0){
            N--;
            String[] command = br.readLine().split(" ");
            switch(command[0]){
                case "push"://데이터 입력
                    queue.add(Integer.parseInt(command[1]));
                    break;
                case "pop"://데이터 삭제
                    if (queue.isEmpty()) {
                        sb.append("-1\n");//큐가 비어있으면 -1
                    }else{
                        sb.append(queue.poll()).append("\n");//큐의 앞 원소 제거 후 출력
                    }//if-else end
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");//큐의 크기 출력
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");//큐가 비어있으면 1, 아니면 0
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");//큐가 비어있으면 -1
                    }else{
                        sb.append(queue.peek()).append("\n");//큐의 앞 원소 출력
                    }//if-else end
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        sb.append("-1\n"); // 큐가 비어있으면 -1
                    }else{
                        sb.append(queue.peekLast()).append("\n");
                    }//if-else end
                    break;
            }//switch end
        }//while end
        System.out.println(sb);
    }//main end
}//class end