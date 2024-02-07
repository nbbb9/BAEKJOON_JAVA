package Step2.BAEKJOON_Conditional;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //현재 시 입력 변수 hour( 0 ~ 23 )
        int hour = sc.nextInt();
        //현재 분 입력 변수 minute( 0 ~ 59 )
        int minute = sc.nextInt();
        //조리시간 입력 변수 cook(분단위)
        int cook = sc.nextInt();
        //현재 분과 조리시간(분)을 더한값을 저장하는 변수 finalminute
        int finalminute = minute + cook;
        //finalminute을 60으로 나누어 조리의 시 단위를 구한다.
        int finalhour = finalminute / 60;
        //22 + 3 =  25시 = 새벽 1시
        //fialminute이 몇시간인지 구하고나서 몇분이 남았는지 저장하는 변수
        int leftminute = finalminute % 60;

        if( (hour < 0 || hour > 23) || (minute < 0 || minute > 59) ){
            //현재 시간 입력값 제한
            System.out.println("시 또는 분을 다시 입력하세요.");
        }else{
            if( finalminute > 59 ){
                //현재 분과 조리시간(분)의 합이 60을 넘는다면 시를 증가시켜야 한다.
                //이때 120분을 초과하는 것처럼 1만 추가하는것이 아닌 더 많은 시를 증가시킬 수도 있다.
                //때문에 현재 분과 조리시간(분)을 더한다음, 60으로 나누어 값을 더하는 방식으로 가야한다
                if( (hour + finalhour) > 23 ) {
                    //입력한 시간과 조리시간의 시단위가 23보다 크다면, 0으로 변환하고 (finalhour-1)을 더해야한다.
                    //leftminute을 종료 분으로 설정한다.
                    System.out.println((0 + ((finalhour + hour)-24) ) + " " + leftminute);
                }else {
                    //입력한 시간과 조리시간의 시단위가 23보다 작다면, 그값을 그대로 출력하고 분단위를 더하면 된다.
                    System.out.println( (hour + finalhour) + " " + leftminute );
                }
            }else{
                //현재 분과 조리시간(분)의 합이 60을 넘지 않는다면 현재 시와 총 조리시간(분)을 출력한다.
                System.out.println( hour + " " + finalminute );
            }
        }

    }
}
