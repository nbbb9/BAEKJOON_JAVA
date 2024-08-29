package Step16_Baekjoon_StackCueDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //명령의 수 N
        int N = Integer.parseInt(br.readLine());
        //Int형 스택 선언
        Stack<Integer> stack = new Stack<>();
        //N이 0이 될 때까지 명령어를 입력받음.
        while(N != 0){
            N--; //N이 0이 될때까지 '-'수행
            //각 회자마다 입력받을 명령어를 저장하는 변수 command. 1번 명령어는 한칸 띄고 두번째 수가 존재하므로 split입력
            String[] command = br.readLine().split(" ");
            switch (command[0]){//command 배열의 첫번째 값이 명령어.
                case "1"://스택에 정수 저장.
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{//정수가 존재하면 정수 빼고 출력
                        sb.append(stack.pop()).append("\n");
                    }//if-else end
                    break;
                case "3"://스택 사이즈(정수의 개수)출력
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }//if-else end
                    break;
                case "5":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{//스택의 맨 위의 정수 출력
                        sb.append(stack.peek()).append("\n");
                    }//if-else end
                    break;
            }//switch end
        }//while end
        br.close();
        //결과값 출력
        System.out.println(sb.toString());
    }//main end
}//class end