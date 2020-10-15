/*
전자매장에는부품이 N개있다. 각부품은정수형태의고유한번호가 있다. 
어느날손님이M개종류의부품을대량으로구매하겠다며당일 날견적서를요청했다. 
손님이문의한M개종류를모두확인해서견적서를작성해야한다. 이 때가게안에부품이모두있는지를확인하는프로그램을작성해보자.

-조건
• 첫째줄에정수 N 이주어진다 
• 둘째줄에는공백으로구분하여 N개의정수가주어진다 
• 셋째줄에정수M이주어진다 
• 넷째줄에는공백으로구분하여M개의정수가주어진다
공백으로구분하여각부품이존재하면 yes를없으면 no를출력한다

-입력예시
5                            N( 전자매장에 있는 부품의 개수)
8 3 7 9 2                     (전자매장에 있는 부품넘버)
3                            M(손님이 문의한 부품의 개수)
5 7 9                         (손님이 주문한 부품넘버)
-출력예시 
no yes yes

*/

import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    //N, M, N_list, M_list 정보 입력받기
    int N = stdIn.nextInt();
    Integer[] N_list = new Integer[N];
    for (int i = 0; i < N; i++){
      N_list[i] = stdIn.nextInt();
    }

  int M = stdIn.nextInt();
    Integer[] M_list = new Integer[M];
    for (int i = 0; i < M; i++){
      M_list[i] = stdIn.nextInt();
    }
  
  //결과를 판단할 배열 만들기 => 여기서 모두 0인 상태
  int[] result = new int[M];
  
  //만약 M_list의 요소가 N_list에 존재하면 result배열의 해당 인덱스를 1로 만든다 
  for (int i = 0; i < M; i++){
    for (int j = 0; j < N; j++){
      if (M_list[i] == N_list[j]){
        result[i] = 1;
      }
    }
  }

  //판단배열에서 1이면 yes출력, 아니면 no출력
  for (int i = 0; i < M; i++) {
    if (result[i] == 1) {
      System.out.print("yes ");
    }else {
      System.out.print("no ");
    }
  }

}
}
