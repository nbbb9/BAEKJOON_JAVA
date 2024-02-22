package Step6_Baekjoon_SHIMWHA1;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        //입력하는 문자열을 저장하는 변수 str
        String str = scan.nextLine();
        //총 몇개의 알파벳인지 계산하기 위한 변수 count
        int count = 0;
        //입력한 문자열의 길이만큼 반복한다.
        //문제에 나와있는 표를 참고해 첫 알파벳이 c, d, l, n, s, z로 이루어진것을 알 수 있다.
        //다중 if문을 통해 첫 알파벳이 무엇인지 판단하고 다음 문자가 무엇인지 판단한다.
        //만약 존재하는 문자라면 다음 i를 건너뛰어야 하므로 i++를 수행한다.
        for (int i = 0; i < str.length(); i++) {
            //입력한 문자열을 charAt메서드를 통해 char형의 배열에 담는다.
            char ch = str.charAt(i);

            if(ch == 'c') {
                //ch가 c일때
                //각 문자마다 if(i < str.length() - 1)을 수행하는 이유는 마지막 인덱스(마지막 문자일 경우를 빼야하기 때문이다.)
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        //만약 ch 다음 문자가 '=' 이라면?
                        // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                        i++;
                    } else if(str.charAt(i + 1) == '-') {
                        //만약 ch 다음 문자가 '-'이라면?
                        // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                        i++;
                    }//else-if end
                }//if end
            } else if(ch == 'd') {
                //ch가 d일 때
                if(i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        //만약 다음 문자가 z일경우
                        if (i < str.length() - 2) {
                            //i가 마지막에서 두번 앞에 있는 문자보다 작을 때
                            if (str.charAt(i + 2) == '=') {
                                // dz= 일 경우
                                i += 2;
                            }//if end
                        }//if end
                    } else if (str.charAt(i + 1) == '-') {
                        // d- 일 경우
                        i++;
                    }//else-if end
                }//if end
            } else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {
                        // lj 일 경우
                        i++;
                    }//if end
                }//if end
            } else if(ch == 'n') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {
                        // nj 일 경우
                        i++;
                    }//if end
                }//if end
            }else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        // s= 일 경우
                        i++;
                    }//if end
                }//if end
            }else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        // z= 일 경우
                        i++;
                    }//if end
                }//if end
            }//else-if end
            count++;
        }//for end
        //count 출력
        System.out.println(count);

    }//main end
}//class end
