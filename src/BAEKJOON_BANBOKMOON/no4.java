package BAEKJOON_BANBOKMOON;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //총 금액
        int total = sc.nextInt();
        //구매한 물건의 종류 수
        int ALLquantity = sc.nextInt();
        //총 가격들을 저장할 변수 sum
        int sum = 0;
        //물건의 개수와 수량을 곱한 값을 저장하는
        int[] intarray = new int[ALLquantity];

        for(int i = 0 ; i < ALLquantity ; ++i){
            //물건의 가격 A
            int price = sc.nextInt();
            //물건의 개수 B
            int quantity = sc.nextInt();
            intarray[i] = price * quantity;
        }
        for(int i = 0 ; i < ALLquantity ; i++){
            sum += intarray[i];
        }

        if( sum == total ){
            System.out.println( "Yes" );
        }else{
            System.out.println( "No" );
        }

    }
}
