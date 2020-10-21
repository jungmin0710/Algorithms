//방법 1(기본)

import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    //입력받기
    Scanner stdIn = new Scanner(System.in);
    int n, m;
    n = stdIn.nextInt();//n은 입력할 숫자의 갯수
    m = stdIn.nextInt();//m은 판단할 금액

    //n만큼의 배열을 만들어서 숫자를 입력받는다
    Integer[] array = new Integer[n];
    for (int i = 0; i < n; i++){
      array[i] = stdIn.nextInt();
    }


    //계산하기
    //0번째 값이 0이고 나머지 m개만큼 초깃값 10001을 가진 배열 dp를 만든다
    int[] dp = new int[m+1];
    for (int i = 1; i < m+1; i++){
      dp[i] = 10001;
    }

    for (int i = 0; i < n; i++) {//판단할 숫자들에 대해서
      for (int j = array[i]; j < m+1; j++){//판단할 숫자와 같거나 큰 범위의 금액에(판단할 숫자보다 작은 금액은 고려할 필요가 없다.)
        if (dp[j-array[i]] != 10001) {//해당 금액을 만드는 방법이 존재했다면(초깃값이 들어있는 경우는 해당 금액을 이전 과정에서 만들 수 없었다는 뜻이다. => 그 다음 금액도 만들지 못한다.(계산 불가능))
          dp[j] = Math.min(dp[j], dp[j-array[i]]+1);//해당 인덱스의 값을 이제까지 계산 값의 최솟값으로 대체한다.
        }
      }
    }

    if (dp[m] == 10001) {//만약 초깃값이면(계산이 불가능하면) -1을 출력한다
      System.out.println(-1);
    }else {//만약 초깃값이 아니면(계산이 된 상태면) 해당 값을 출력한다.
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

