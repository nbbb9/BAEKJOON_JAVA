package Step3_Baekjoon_Repetitivw;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        //총 금액을 입력받는 변수 total
        int total = sc.nextInt();
        //구매한 물건의 종류 수 ALLquantity
        int ALLquantity = sc.nextInt();
        //총 가격들을 저장할 변수 sum
        int sum = 0;
        //물건의 개수와 수량을 곱한 값을 저장하는 배열 intarray
        int[] intarray = new int[ALLquantity];

        //입력한 물건의 개수만큼 반복문을 수행한다.
        for(int i = 0 ; i < ALLquantity ; ++i){
            //물건의 가격 A
            int price = sc.nextInt();
            //물건의 개수 B
            int quantity = sc.nextInt();
            //반복 1회마다 가격과 개수를 곱한 값을 배열에 담는다.
            intarray[i] = price * quantity;
        }//for end

        for(int i = 0 ; i < ALLquantity ; i++){
            //sum에 반복 1회마다 첫 인덱스 부터의 값을 더한다.
            //그럼, 맞아야 하는 총 가격이 sum에 저장된다.
            sum += intarray[i];
        }//for end

        if( sum == total ){
            System.out.println( "Yes" );
        }else{
            System.out.println( "No" );
        }//if end

    }//main end
}//class end
