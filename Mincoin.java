//방법 1(기본)

import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    //입력받기
    Scanner stdIn = new Scanner(System.in);
    int n, m;
    n = stdIn.nextInt();
    m = stdIn.nextInt();

    Integer[] array = new Integer[n];
    for (int i = 0; i < n; i++){
      array[i] = stdIn.nextInt();
    }


    //계산하기
    int[] dp = new int[m+1];
    for (int i = 1; i < m+1; i++){
      dp[i] = 10001;
    }

    for (int i = 0; i < n; i++) {
      for (int j = array[i]; j < m+1; j++){
        if (dp[j-array[i]] != 10001) {
          dp[j] = Math.min(dp[j], dp[j-array[i]]+1);
        }
      }
    }

    if (dp[m] == 10001) {
      System.out.println(-1);
    }else {
      System.out.println(dp[m]);
    }
  }
}


//방법 2(메서드 분리)

import java.util.Scanner;
import java.lang.Math;

class Main {{// 경우의 수 계산 메서드
  public static int CaseNumber(int n, int m, Integer[] array){
    int[] dp = new int[m+1];
    for (int i = 1;i <m+1; i++){
      dp[i] = 100001;
    }

    for (int i = 0; i < n; i++){
      for (int j = array[i]; j < m+1;j++){
        if (dp[j - array[i]] != 100001) {
          dp[j] = Math.min(dp[j],dp[j-array[i]]+1);
          }
      }
    }
    if (dp[m] == 100001) {
      return -1;
    }else{
      return dp[m];
    }
    
  }

    //실행 메서드
  public static void main(String[] args) {
    //입력받기
    Scanner stdIn = new Scanner(System.in);
    int n, m;
    n = stdIn.nextInt();
    m = stdIn.nextInt();

    Integer[] array = new Integer[n];
    for (int i = 0; i < n; i++){
      array[i] = stdIn.nextInt();
    }

    //메서드를 호출해서 출력
  int X = CaseNumber(n, m, array);
  System.out.println(X);

  }
}

