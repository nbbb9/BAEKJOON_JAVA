package Step5.BAEKJOON_String;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //문자를 우선 정수형 변수로 입력받은 후 charAt 메서드로 배열로 만든다.
        //하나의 문자만 입력하므로 0번인덱스만 출력한다.
        int ch = scan.next().charAt(0);
        //ch출력
        System.out.print(ch);

        //아래는 read를 통한 또다른 방법이다.
//        public class Main {
//
//            public static void main(String[] args) throws Exception {
//                int a = System.in.read();
//                System.out.print(a);
//            }
//        }

    }//main end
}//class end
