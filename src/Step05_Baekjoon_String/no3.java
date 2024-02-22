package Step05_Baekjoon_String;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //입력하는 테스트케이스의 횟수를 저장하는 변수 T
        int T = scan.nextInt();
        //테스트케이스만큼 반복문을 수행하면서 문자열을 입력받는다.
        for(int i = 0 ; i < T ; i++){
            String str = scan.next();
            //charAt메서드로 문자열을 char형 배열로 만들고, 첫번째 문자와 마지막 문자를 출력한다.
            //중간에 ""가 없으면 int형으로 계산되므로 꼭 넣어준다.
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }//for end

    }//main end
}//class end
