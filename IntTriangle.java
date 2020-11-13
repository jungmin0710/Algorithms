//방법 1

import java.util.*;

class Main {
  public static void main(String[] args) {
    //입력받아서 2차원배열로 저장하기
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[][] arr = new int[n+1][n+1];
    for (int i = 0; i <n; i++){
      for (int j = 0; j <i+1; j++){
        arr[i][j] = stdIn.nextInt();
      }
    }

    //합계 계산하기
    int m = 2; //배열 입력시 2번째행의 인덱스는 0,1이므로 초기값을 2로 설정한다
    for (int i = 1; i < n; i++){
      for (int j = 0; j < m; j++){
        if (j == 0){//맨 왼쪽 인덱스에 해당하는 숫자면 자기자신+자기자리와 같은 인덱스숫자
          arr[i][j] = arr[i][j] + arr[i-1][j];
        }else if(j == i){//맨 오른쪽 인덱스에 해당하는 숫자면 자기자신+자기자리 바로 전 인덱스 숫자
          arr[i][j] = arr[i][j] + arr[i-1][j-1];
        }else{//아니면 자기자신+ 양 숫자중 큰 숫자인 경우를 더한다
          arr[i][j] = Math.max(arr[i-1][j-1],arr[i-1][j]) + arr[i][j]; 
        }
      }
      m += 1;//다음 행으로 넘어갈때 숫자 증가(열의 총 개수)
    }

    //마지막 행에서 최댓값을 찾아 출력하기
    int max = -1;
    for (int i = 0; i < arr[n-1].length; i++)
      if (max < arr[n-1][i]) {
        max = arr[n-1][i];
      }
    System.out.println(max);
  }
}








//방법 2

/*
밑에서 위로 올라가는 계산법!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
  public static void main(String[] args) {
    BufferReader br = new BufferedReader(new InputStreamReader(System.in));

    //Scanner scan = new Scanner(System.in);
    //int n = scan.nextInt();

    int n = Integer.parseInt(br.readLine());

    int[][] dp = new int[n+1][n+1];
    int max = 0;
    for (int i = 1; i <= n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= i; j++){
        dp[i][j] = Integer.parseInt(st.nextToken());
        //dp[i][j] = scan.nextInt();//배열에 입력값 저장
        //바로 다음 행의 값 결정
        //왼쪽 끝에서는 항상 오른쪽 위의 값, 오른쪽 끝에서는 항상 왼쪽 위의 값을 더하여 저장
        //나머지는 왼쪽 위의 값을 합친 값vs 오른쪽위의 값을 합친 값 중 최댓값을 저장
        if (i==1) {
          dp[i][j] = dp[i-1][j] + dp[i][j];
        }else if(i==j) {
          dp[i][j] = dp[i-1][j-1] + dp[i][j];
        }else{
          dp[i][j] = Math.max((dp[i-1][j] + dp[i][j]), (dp[i-1][j-1]+dp[i][j]));
        }

        //최댓값 바로 결정하기
        max = Math.max(max, dp[i][j]);

      }
    }
    System.out.println(max);
  }
}
