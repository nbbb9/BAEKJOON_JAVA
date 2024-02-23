package Step02_Baekjoon_Conditional;

import java.util.Scanner;
public class no02 {
    public static void main(String[] args) {
        //Scanner 객체 생성.
        Scanner sc = new Scanner(System.in);
        //시험 성적을 입력받는 변수 point
        int point = sc.nextInt();
        //만약 point가 0보다 작거나 100보다 크다면 다시 입력하도록 제한한다.
        if(point < 0 | point > 100){
            System.out.println("점수를 다시 입력하세요.");
        }else{
            //각 구간에 맞는 값을 출력.
            if(point >= 90 && point <=100){
                System.out.println("A");
            }else if(point >= 80 && point <= 89){
                System.out.println("B");
            }else if(point >= 70 && point <= 79){
                System.out.println("C");
            }else if(point >= 60 && point <= 69){
                System.out.println("D");
            }else{
                System.out.println("F");
            }//if-else2 end
        }//else-if end
    }//main end
}//class end
