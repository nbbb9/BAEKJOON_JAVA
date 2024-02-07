package Step5.BAEKJOON_String;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        //문제의 이해가 중요하다.
        //baek이라는 문자가 들어왔을때, ary라는 a 부터 z까지의 존재여부를 저장하는 배열에 -1을 넣고(존재하지 않으면 -1)
        //특정 알파벳이 존재한다면 그 알파벳이 총 4개의 문자로 이루어진 문자열 중에서 몇번째에 존재하는지 출력하면 된다.
        //인덱스와 같은 개념이므로 0부터 출력한다.
        //그럼 여기선, b가 첫번째로 입력되었으니 0, a가 2번째로 입력되었으니 1이다.
        Scanner scan = new Scanner(System.in);
        //a부터 z까지의 존재여부를 저장하는 배열을 선언. 크기는 26(소문자만 있으므로)
        int [] ary = new int[26];

        //배열의 기본값을 -1로 설정한다.
        for(int i = 0 ; i < ary.length ; i++){
            ary[i] = -1;
        }//for end

        //소문자로만 입력
        String S = scan.next();

        for(int i = 0 ; i < S.length() ; i++){
            //변수 ch에 S의 i번째 특정 문자열을 저장한다.
            char ch = S.charAt(i);
            //i=0일 때 첫번째 문자열에 'a'를 뺀 후 해당 배열 인덱스의 값은 -1이므로 해당 값을 i의 값인 0으로 바꾼다.
            //이러면, 특정 문자열이 몇번째에 입력되었는지 알 수 있다.
            if(ary[ch - 'a'] == -1){
                ary[ch - 'a'] = i;
            }
        }//for end

        //배열 출력
        for(int i = 0 ; i < ary.length ; i++){
            System.out.print(ary[i] + " ");
        }//for end

    }//main end
}//class end
