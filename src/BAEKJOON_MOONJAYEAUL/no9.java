package BAEKJOON_MOONJAYEAUL;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();

        String reverseA = Character.toString(A.charAt(2))+Character.toString(A.charAt(1))+Character.toString(A.charAt(0));
        String reverseB = Character.toString(B.charAt(2))+Character.toString(B.charAt(1))+Character.toString(B.charAt(0));

        if(Integer.parseInt(reverseA)>Integer.parseInt(reverseB)) {
            System.out.println(reverseA);
        }else {
            System.out.println(reverseB);
        }

    }//end main
}//end class
