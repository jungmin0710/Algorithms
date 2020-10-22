/*
정수 X가주어졌을 때, 정수 X에사용할수있는연산은다음과같이 4가지입니다. 
• X가 5로나누어떨어지면 5로나눕니다. 
• X가 3으로나누어떨어지면 3으로나눕니다. 
• X가 2로나누어떨어지면 2로나눕니다. 
• X에서 1을뺍니다.

정수 X가주어졌을 때, 연산 4개를적절히사용해서값을 1로만들고자합니다. 연산을사용하는횟수의최솟값을출력하세요.

입력조건 
• 첫째줄에정수 X 가주어진다.
출력조건 
• 첫째줄에연산을하는횟수의최솟값을출력한다.

입력예시 26
출력예시 3
*/

import java.util.Scanner;

class Main {
  //연산횟수를 세는 함수
  public static int countC(int x){
    //dp배열을 생성한다
    int[] dp = new int[x+1];
  //2번 인덱스부터 마지막까지 1의 연산값을 채워넣는다
   for (int i = 2; i < x+1; i++ ){
     dp[i] = dp[i-1] +1;
    //2의배수 인덱스를 2의 연산값으로 갱신한다
     if(i%2 == 0) {
       dp[i] = Math.min(dp[i],dp[i/2]+1);
     }
    //3의배수 인덱스를 3의 연산값으로 갱신한다
     if(i%3 == 0) {
       dp[i] = Math.min(dp[i],dp[i/3]+1);
     }
    //5의배수 인덱스를 5의 연산값으로 갱신한다
     if(i%5 == 0) {
       dp[i] = Math.min(dp[i],dp[i/5]+1);
     }
   }
   //목표값인 마지막 인덱스의 연산횟수값을 반환한다.
    return dp[x];
  }

//실제 실행되는 메서드(메인 => 입력받아 함수를 호출해 출력한다)
  public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  int X = stdIn.nextInt();
  System.out.println(countC(X));

  }
}
