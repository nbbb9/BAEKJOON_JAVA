package Step08_Baekjoon_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no7 {
    public static void main(String[] args) throws IOException {
        //BufferedReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer 객체 생성
        StringTokenizer st = new StringTokenizer(reader.readLine());
        //각각 A,B,V를 입력받는 변수.
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        //(V-B)의 이유 : '낮에 정점에 도달하면 미끄러지지 않음'. 그냥 V/(A-B)를 해버리면, 도달하고나서도 내려간다는 조건이 생긴다.
        int day = (V - B) / (A - B);
        //근데 만약, 두가지를 나눈 값이 딱 떨어지지 않는다면, 어짜피 나머지이므로 몫으로 나온 날의 다음날에는 무조건 정점을 넘는다.
        //때문에 day++를 수행.
        if ((V - B) % (A - B) != 0) {
            day++;
        }//if end
        System.out.println(day);

        //아래는 시도했던게 아까워서 남겨둠.
        //A는 V보다 무조건 작다는 조건은 문제에 명시되어있으므로
        //코드상에서 구현하지 않아도 됨.
//        if( A > V ){
//            dayCount = 1;
//        }else{
//            for(int i = length ; i <= V ; i+=A){
//                if( i+A >= V){
//                    dayCount++;
//                    break;
//                }//if2 end
//                i -= B;
//                dayCount++;
//            }//for end
//        }//else end


//        boolean  bl = false;
//
//        do{
//            if( A > V ){
//                dayCount++;
//                bl = true;
//            }else{
//                length += A;
//                if( length >= V ){
//                    bl = true;
//                    dayCount++;
//                    break;
//                }//if2 end
//                length -= B;
//                dayCount++;
//            }//else end
//        }while(bl == false);

        //System.out.println(dayCount);
    }//main end
}//class end
