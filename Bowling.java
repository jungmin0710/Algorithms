/*
A, B 두 사람이 볼링을 치고 있습니다. 두 사람은 서로 무게가 다른 볼링공을 고르려고 합니다. 볼링공은 총 N개가 있으며 각 볼링공마다 무게가 적혀 있고, 공의 번호는 1번부터 순서대로 부여됩니다. 또한 같은 무게의 공이 여러 개 있을 수 있지만, 서로 다른 공으로 간주합니다. 볼링공의 무게는 1부터 M까지의 자연수 형태로 존재합니다.
예를 들어 N이 5이고, M이 3이며 각각의 무게가 차례대로 1, 3, 2, 3, 2일 때 각 공의 번호가 차례대로 1번부터 5번까지 부여됩니다. 이때 두 사람이 고를 수 있는 볼링공 번호의 조합을 구하면 다음과 같습니다

(1번, 2번), (1번, 3번), (1번, 4번), (1번, 5번), (2번, 3번), (2번, 5번), (3번, 4번), (4번, 5번)

결과적으로 두 사람이 고르는 경우의 수는 8가지 입니다. N개의 공의 무게가 주어질 때, 두 사람이 볼링공을 고르는 경우의 수를 구하는 프로그램을 작성하세요.

-입력예시
5 3
1 3 2 3 2
/
8 5
1 5 4 3 2 4 5 2

-출력예시
8
/
25
*/
import java.util.*;

class Main {
  public static void main(String[] args) {
    //입력받기
    Scanner stdIn = new Scanner(System.in);
    int n,m;
    n = stdIn.nextInt();
    m = stdIn.nextInt();
    
    int[] ball = new int[n];
    int TrueFalse = -1;//참거짓 판별 변수
    for (int i = 0; i < n; i++){
      int x = stdIn.nextInt();
      if (x <= m) {
        ball[i] = x;
      }else {
        System.out.println("알맞은 무게가 입력되지 않았습니다.");//m보다 큰 무게가 입력되었을경우
        TrueFalse = 0;//거짓을 의미하는 의미로 0으로 바꿈
        break;
      }
    }
    

    //계산하기:우선 한사람이 i번째를 골랐을때 이후 나오는 j번째 공이 무게가 같지 않으면 된다.
    int count = 0;//총 경우의 수를 담을 변수
    for (int i = 0; i < n; i++){
      for (int j = i+1; j < n; j++){
        if (ball[i] != ball[j]) {
          count++;
        }
      }
    }

    //출력
    if (TrueFalse == -1) {//참거짓 판별 변수가 참일때만 출력
      System.out.println(count);
      }
  }
}
