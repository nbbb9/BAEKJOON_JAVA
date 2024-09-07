package Step21_Baekjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no03 {
    //recursion함수의 호출 횟수를 알기위한 전역 변수.
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T ; i++){
            result = 0;
            String s = br.readLine();
            System.out.println(isPalindrome(s) + " " + result);
        }
        br.close();
    }//main end
    public static int recursion(String s, int l, int r){
        result++;
        //s는 문자열, l은 시작지점, r은 끝지점.
        if(l >= r) return 1;//팰린드롬일때 재귀함수 종료
        else if(s.charAt(l) != s.charAt(r)) return 0;//팰린드롬이 아님
        else return recursion(s, l+1, r-1);//
    }//recursionm end
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }//isPalindrome end
}//class end