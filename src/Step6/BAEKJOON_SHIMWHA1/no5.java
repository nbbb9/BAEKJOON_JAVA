package Step6.BAEKJOON_SHIMWHA1;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char [] chars = str.toCharArray();
        char [] test = new char[str.length()];
        //
        int count = 0;

        int [] countary = new int[100];

//        for( int i = 0 ; i < str.length() ; i++ ){
//            test[i] = chars[i];
//        }

        //이거 아님.;,.....키르나ㅣㅁ의ㅏㄴ;ㅣㅇ라ㅡㅁㄷㄴ란ㄹ
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; i < str.length() ; j++){
                if(chars[i] == chars[j]){
                    count++;
                    countary[i] = count;
                }//if end
            }//for2 end

        }//for end

    }
}
