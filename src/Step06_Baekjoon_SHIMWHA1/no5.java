package Step06_Baekjoon_SHIMWHA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        //입력받은 문자열을 모두 대문자로 변환
        str = str.toUpperCase();
        //문자열을 char형의 배열에 저장(이후, 입력문자열 배열이라 말하겠다.)
        char [] chars = str.toCharArray();
        //알파벳을 순차적으로 담는 배열 alphaAry
        char [] alphaAry = new char[26];
        //alphaAry와 같은 크기의 배열. 각 알파벳이 문자열 중 몇개인지 구하기 위해
        int [] alphaAryInt = new int[26];

        //알파벳 대문자를 하나씩 alphaAry에 담는 코드.
        // q는 반복문을 진행하면서 초기화되면 안되므로 외부에 생성.
        int q = 0;
        for(char i = 'A' ; i <= 'Z' ; i++){
            alphaAry[q] = i;
            q++;
        }//for end
        //각 리스트가 잘 생성되었는지 확인하는 코드.
//        for(int i = 0 ; i < chars.length ; i++){ System.out.print(chars[i] + " "); }
//        System.out.println();
//        for(int i = 0 ; i < alphaAry.length ; i++){ System.out.print(alphaAry[i] + " "); }

        //입력문자열배열과 알파벳배열을 비교하면서, 각 알파벳에 동일한 값이 있다면, ++를 수행하면서,
        //각 알파벳의 개수가 몇개인지 구한다.
        for(int i = 0 ; i < alphaAry.length ; i++){
            for(int j = 0 ; j < chars.length ; j++){
                if( alphaAry[i] == chars[j] ){
                    alphaAryInt[i]++;
                }//if end
            }//for2 end
        }//for end

        //개수측정 배열의 값이 올바르게 들어갔는지 확인하기 위한 코드
//        for(int i = 0 ; i < alphaAryInt.length ; i++){
//            System.out.print(alphaAryInt[i] + " ");
//        }//for end
        //가장 많은 알파벳의 개수를 저장하는 변수 maxAlpa
        int maxAlpa = 0;
        //가장 많은 알파벳의 인덱스를 저장하는 변수 result
        int result = 0;
        //알파벳의 개수(26개)만큼 반복
        for(int i = 0 ; i < alphaAryInt.length ; i++){
            //만약, 각 알파벳의 개수가 0이 아니고 temp값이 그 개수보다 작다면,
            //temp에 해당개수를 넣고, result변수에 해당 인덱스를 저장한다.
            if( alphaAryInt[i] != 0 && alphaAryInt[i] > maxAlpa) {
                maxAlpa = alphaAryInt[i];
                result = i;
            }//if end
        }//for end

        //최대값의 수가 동일한게 있는지 계산하기위한 변수 count.
        //만약 반복문이 끝나고, count가 2이상이면 ?를 출력.
        int count = 0;
        //알파벳의 개수가 담긴 배열을 돌면서, 가장 많은 알파벳의 개수(temp)와 같다면 count++
        for(int i = 0 ; i < alphaAryInt.length ; i++){
            if( alphaAryInt[i] == maxAlpa ){
                count++;
            }//if end
        }//for end
        //count의 개수를 확인하기위한 코드
        //System.out.println(count);
        //만약, count가 2 이상이라면 2개이상의 알파벳이 같은 최대값을 가지므로 ?출력 후 시스템 종료
        if( count >= 2 ){
            System.out.println("?");
            System.exit(0);
        }//if end
        //가장 많은 알파벳의 종류가 하나일 경우, result에 저장된 인덱스값에 해당하는 알파벳 출력.
        System.out.println(alphaAry[result]);

    }//main end
}//class end
