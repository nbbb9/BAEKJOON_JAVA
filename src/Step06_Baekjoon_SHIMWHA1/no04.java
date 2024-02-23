package Step06_Baekjoon_SHIMWHA1;

import java.util.Scanner;

public class no04 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //입력하는 문자열을 저장하는 변수 str
        String str = scan.nextLine();
        //str을 char형 배열로 변경
        char [] chars = str.toCharArray();
        //입력한 문자열을 거꾸로 뒤딥어서 저장할 배열 reversechars
        char [] reversechars = new char[str.length()];
        //입력한 문자열의 길이를 저장하는 변수 gilee
        int gilee = str.length();
        //팰린드롬인지 아닌지 결과를 저장하기 위한 변수 bl
        boolean bl = false;
        //입력한 문자열을 거꾸로 뒤집어서 배열에 저장한다.
        for (int i = 0 ; i < gilee ; i++){
            reversechars[i] = chars[gilee-1-i];
        }//for end
        //원본 문자열을 담은 배열과 역순 문자열을 담은 배열의 0번째 인덱스부터비교하면서
        //같다면 true, 다르다면 false를 bl에 저장한다.
        //만약 다른값이 나온다면, 더이상 비교할 필요가 없으므로 break
        for(int i = 0 ; i < gilee ; i++){
            if(reversechars[i]==chars[i]){
                bl=true;
            }else{
                bl = false;
                break;
            }//if-else end
        }//for end

        if( bl == true ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }//if-else end

    }//main end
}//class end
