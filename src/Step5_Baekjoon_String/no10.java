package Step5_Baekjoon_String;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //사용자의 입력값을 저장하는 변수 dial
        String dial = scan.nextLine();
        //각 알파벳별로 걸리는 시간의 변화를 저장할 변수 count
        int count = 0;
        //입력받은 문자열의 길이를 저장하는 변수 k
        int k = dial.length();
        //문자열의 길이만큼 반복문 수행
        for(int i = 0 ; i < k ; i++){
            //우선 입력받은 문자열을 charAt메서드를 통해 char형 배열로 만든다.
            //다음 반복문을 통해 인덱스 0부터 끝까지 switch로 비교하면서 해당 case에 맞는 수를 count에 더한다.
            switch (dial.charAt(i)) {
                //만약 A, B, C면 3을 더한다.
                case 'A': case 'B': case 'C':
                    count += 3;
                    break;
                //만약 D, E, F면 4를 더한다.
                case 'D': case 'E': case 'F':
                    count += 4;
                    break;
                //만약 G, H, I면 5를 더한다.
                case 'G': case 'H': case 'I':
                    count += 5;
                    break;
                //만약 J, K, L이면 6을 더한다.
                case 'J': case 'K': case 'L':
                    count += 6;
                    break;
                //만약 M, N, O면 7을 더한다.
                case 'M': case 'N': case 'O':
                    count += 7;
                    break;
                //만약 P, Q, R, S면 8을 더한다.
                case 'P': case 'Q': case 'R': case 'S':
                    count += 8;
                    break;
                //만약 T, U, V면 9를 더한다.
                case 'T': case 'U': case 'V':
                    count += 9;
                    break;
                //만약 W, X, Y, Z면 10을 더한다.
                case 'W': case 'X': case 'Y': case 'Z':
                    count += 10;
                    break;
            }//switch end

        }//for end
        //count 출력
        System.out.println(count);

    }//main end
}//class end
