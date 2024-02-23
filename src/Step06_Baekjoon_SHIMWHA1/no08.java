package Step06_Baekjoon_SHIMWHA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //과목 이름
        String name;
        //과목 학점
        double subScore;
        //받은 학점
        String grade;
        //과목학점 X 받은학점의 총합
        double sumRealScore = 0;
        //받은 학점의 총합
        double sumScore = 0;
        //20개의 과목에 대한 정보를 입력받으므로 20까지 반복
        for(int i = 0 ; i < 20 ; i++){
            st = new StringTokenizer(reader.readLine(), " ");
            name = st.nextToken();
            subScore = Double.parseDouble(st.nextToken());
            grade = st.nextToken();
            //등급을 실제 점수로 변환.
            double realScore = 0;
            //만약 등급이 "P"가 아니라면
            if (!(grade.equals("P"))){
                //각 등급에 맞는 점수를 realScore에 저장한다.
                switch (grade){
                    case "A+" :
                        realScore = 4.5;
                        break;
                    case "A0" :
                        realScore = 4.0;
                        break;
                    case "B+" :
                        realScore = 3.5;
                        break;
                    case "B0" :
                        realScore = 3.0;
                        break;
                    case "C+" :
                        realScore = 2.5;
                        break;
                    case "C0" :
                        realScore = 2.0;
                        break;
                    case "D+" :
                        realScore = 1.5;
                        break;
                    case "D0" :
                        realScore = 1.0;
                        break;
                    case "F" :
                        realScore = 0.0;
                        break;
                    default :
                        break;
                }//switch end
                //전공평점 = (과목학점X받은학점)의 총합을 수강한 과목학점의 총함을 나눈다.
                sumRealScore += (subScore * realScore);
                //입력할때마다 수강한 학점의 총합을 더한다.
                sumScore += subScore;
            }//if end
        }//for end
        //reader 종료
        reader.close();
        //소수점아래 6자리까지이므로 prinf를 통한 출력. sumRealScore / sumScore을 통해 전공평점을 구한다.
        System.out.printf("%.6f", sumRealScore / sumScore);

    }//main end
}//class end
