package Step16_Baekjoon_StackCueDeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if(input.equals(".")){
                break;//"."입력시 다음 입력으로.
            }//if end

            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);//여는 괄호는 스택에 추가
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isVPS = false;//짝이 맞지 않음
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isVPS = false;//짝이 맞지 않음
                        break;
                    }//if2 end
                }//if-else end
            }//for end
            // 스택이 비어있어야 균형 잡힌 괄호
            if(isVPS && stack.isEmpty()) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }//if-else end
        }//while end
    }//main end
}//class end