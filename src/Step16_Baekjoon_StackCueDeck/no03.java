package Step16_Baekjoon_StackCueDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class no03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력 횟수 T
        int T = Integer.parseInt(br.readLine());

        while(T!=0){
            T--;
            String input = br.readLine();
            //Character형 스택 선언
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for(char c : input.toCharArray()) {
                if(c == '(') {
                    stack.push(c);//여는 괄호는 스택에 추가
                }else if(c == ')') {
                    if(stack.isEmpty()) {
                        isVPS = false;//짝이 맞지 않음
                        break;
                    }//if2 end
                    stack.pop();//짝이 맞으면 스택에서 제거
                }//else-if end
            }//for end
            //스택이 비어있지 않으면 여는 괄호가 남아있는 것이므로 유효하지 않음
            if (isVPS && stack.isEmpty()) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }//if-else end
        }//while end
    }//main end
}//class end