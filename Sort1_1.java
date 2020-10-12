import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    //갯수 입력받아 빈 배열 생성
    Scanner stdId = new Scanner(System.in);
    int N = stdId.nextInt();
    
    int[] N_list = new int[N];
    int[] result_list = new int[N];

    //숫자 입력받기
    for (int i = 0; i < N ; i++){
      int x = stdId.nextInt();
      N_list[i] = x;
    }

    //오름차순 정렬하기
    Arrays.sort(N_list);

    //내림차순으로 정렬
    for (int i = 0; i < N ; i++){
      result_list[i] = N_list[N-1-i];
    }
    
    //출력하기
    for (int i = 0; i < N; i++){
      System.out.print(result_list[i] + " ");
    }
  }
}
