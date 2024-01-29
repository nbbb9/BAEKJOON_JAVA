package BAEKJOON_ZOGUNMOON;

import java.util.Scanner;

// psvm 입력 후 ctrl + space를 하면 public static void main 자동완성.
public class no2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();

        if(point < 0 | point > 100){
            System.out.println("점수를 다시 입력하세요.");
        }else{
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
            }
        }
    }
}
