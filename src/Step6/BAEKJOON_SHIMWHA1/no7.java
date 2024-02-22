package Step6.BAEKJOON_SHIMWHA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //몇개의 단어를 입력받을지 입력받는 변수 N
        int N = Integer.parseInt(reader.readLine());
        //그룹단어가 몇개인지 계산하기 위한 변수 count
        int count = 0;
        //N만큼 반복하면서 단어를 입력받고 해당 단어가 cheakAlpa()메서드를 거쳐 ture가 반환되면 count 증가
        for(int i = 0 ; i < N ; i++){
            String str = reader.readLine();
            boolean bl = checkGroup(str);
            if(bl == true){
                count++;
            }//if end
        }//for end
        //BufferedReader 종료
        reader.close();
        //결과값 반환
        System.out.println(count);

    }//main end

    public static boolean checkGroup(String str){
        //각 알파벳의 개수만큼 true, false를 저장하는 배옇 check.
        //각 알파벳의 등장여부(?)를 알 수 있다. 불린형 배열의 초기값은 false
        boolean[] check = new boolean[26];
        //비교중인 문자말고 이전에 존재하는 알파벳을 저장하기 위한 변수 prev
        int prev = 0;
        //입력한 단어의 길이만큼 반복하면서 해당문자가 이전에 존재했는지 여부 판단.
        for(int i = 0; i < str.length(); i++) {
            //i 번째 문자 저장 (현재 문자)
            int now = str.charAt(i);
            //만약 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {
                //해당 문자가 처음 나오는 경우 (false 인 경우)
                //a를 빼는 이유 >> 문제에 입력은 소문자로만 있다고 명시. 배열의 첫번째는 0인데, 만약 a가 입력된 상태에서 a를 빼면
                //0번인덱스 즉, a를 가리킨다. 이처럼 now가 몇번째 인덱스에 있는 알파벳인지 알 수 있다.
                if ( check[now - 'a'] == false ) {
                    //해당 알파벳이 존재하는 인덱스의 값을 true로 바꿔준다
                    check[now - 'a'] = true;
                    //다음 비교를 위해 prev에 현재 문자를 저장.
                    prev = now;
                }else{
                    // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) false반환 후 함수종료
                    return false;
                }//if-else end
            }//if2 end
        }//for end
        //해당되는 경우가 단어인경우 true를 반환.(그룹단어임)
        return true;
    }//checkGroup method end
}//class end
