package Step02_Baekjoon_Conditional;

import java.util.Scanner;
public class no03 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //연도를 입력받는 변수 year
        int year = sc.nextInt();
        //윤년 : 4의 배수이면서 100의 배수가 아닐 때 or 400의 배수일 때
        if( (year < 1) || year > 4000 ){
            //입력 제한.
            System.out.println("년도는 1~4000년까지 입력하세요.");
        }else{
            //만약 입력한 연도가 4의 배수이면서 100의 배수가 아니거나 or 400의 배수가 아닐때
            if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ){
                //윤년이 맞으면 1 출력
                System.out.println(1);
            }else{
                //윤년이 아니라면 0 출력
                System.out.println(0);
            }//else-if2 end
        }//else-if end
    }//main end
}//class end
