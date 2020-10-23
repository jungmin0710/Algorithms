//피보나치 수열 다이나믹프로그래밍으로 구현하기

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //n번째 피보나치 수열 구하기 : n입력
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    //n인덱스까지 만들기
    Integer[] dp = new Integer[n+1];
    //0, 1번 숫자를 설정한다
    dp[0] = 0;
    dp[1] = 1;
    //i번째 수는 i-2번째와 i-1번째를 더한 수다
    for (int i = 2; i < n+1; i++) {
      dp[i] = dp[i-2] + dp[i-1];
    }
    //목표인 n번 인덱스를 출력한다
    System.out.println(dp[n]);
  }
}
