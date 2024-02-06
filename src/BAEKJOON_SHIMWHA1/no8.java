package BAEKJOON_SHIMWHA1;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] name = new String[20];
        double [] score = new double[20];
        String [] grade = new String[20];

        double sum = 0;

        for(int i = 0 ; i < 20 ; i++){
            name[i] = scan.nextLine();
            score[i] = scan.nextDouble();
            grade[i] = scan.nextLine();
        }//for end

        for(int i = 0 ; i < 20 ; i++){
            if(grade[i] == "P"){
                score[i] = 0.0;
            }//if end
        }//for end

        for(int i = 0 ; i < 20 ; i++){
            sum += score[i];
        }//for end

        System.out.println(sum/20);

    }//main end
}//class end
