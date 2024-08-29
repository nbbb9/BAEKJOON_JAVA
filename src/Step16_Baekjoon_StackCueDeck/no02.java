package Step16_Baekjoon_StackCueDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class no02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //정수의 수 K
        int K = Integer.parseInt(br.readLine());
        //Int형 스택 선언
        Stack<Integer> stack = new Stack<>();
        while (K != 0){
            K--;
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }//if-else end
        }//while end
        br.close();
        int sum = 0;
        //for 루프에서 stack.size()로 하게되면, 루프문을 돌 때 마다 pop()으로 인해 사이즈가 줄어들어 문제가 발생한다.
//        for(int i = 0; i < stack.size(); i++){
//            sum+=stack.peek();
//            stack.pop();
//        }//for end
        while(!stack.isEmpty()){
            sum+=stack.pop();//peek값을 더하고 pop을 해도 되지만 의미없는 일임.
        }//while end
        System.out.println(sum);
    }//main end
}//class end