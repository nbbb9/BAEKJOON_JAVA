package Step04_Baekjoon_Array;

import java.util.Scanner;

public class no08 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //크기가 10인 배열 생성
        int [] numary = new int[10];
        //다른값이 몇개인지 계산하기 위한 변수 count
        int count = 0;
        //같은지 다른지 판단하고 그 결과를 저장하기 위한 변수 bl
        boolean bl;
        for(int i = 0 ; i < 10 ; i++){
            //입력값을 저장하는 변수 num
            int num = scan.nextInt();
            //입력값을 42로 나눈 나머지를 numary에 저장한다.
            numary[i] = num % 42;
        }//for end
        //이중 for문을 사용해 하나의 인덱스 값을 전체 배열의 값들과 비교한다.
        //bl변수의 초기값을 false로 설정한 후 2번째 for문에서 비교한 결과가 나온다면 bl을 true로 바꾼 후 종료하고,
        //만약 9번인덱스까지 비교했는데 같은값이 없다면 false인 상태로 2번째 for문을 마친다음 아래의 if문을 통해 fasle라면 count++를 수행한다.
        //다시 for문을 시작할 땐 다시 bl을 false로 초기화하고 같은 반복문을 수행한다.
        for(int i=0; i<numary.length; i++) {
            bl = false;
            for (int j = i + 1; j < numary.length; j++) {
                if (numary[i] == numary[j]) {
                    bl = true;
                    break;
                }//if end
            }//for2 end
            if (bl == false) {
                count++;
            }//if end
        }//for end
        //결과값 출력.
        System.out.println(count);
    }//main end
}//class end
