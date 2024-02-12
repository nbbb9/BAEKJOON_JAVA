package Step8.BAEKJOON_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no7 {
    //문제는 풀었지만 시간초과 발생...해결이 안됨...
    public static void main(String[] args) throws IOException {
        //BufferesReader 객체 생성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int dayClimb = A - B;
        int dayCount = 0;
        int length = 0;

        int testday = 0;

        if( dayClimb != 1 ){
            testday = V/dayClimb;
            testday += 1;
        }else{
            testday = (V/dayClimb) -1;
        }


        System.out.println(testday);


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
