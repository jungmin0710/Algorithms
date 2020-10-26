/*
한 마을에 모험가가 N명 있습니다. 
모험가 길드에는 N명의 모험가를 대상으로 ‘공포도’를 측정했는데  ‘공포도’가 높은 모험가는 쉽게 공포를 느껴 위험상황에서 제대로
대처할 능력이 떨어집니다.
모험가 길드장인 스틴이는 모험가그룹을 안전하게 구성하고자  공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정했습니다. 
스틴이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금합니다.
스틴이를위해 N명의 모험가에 대한 정보가 주어졌을 때 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하세요. (ArrayList 사용)

입력조건 5/ 2 3 1 2 2
• 첫째줄에모험가의수N이주어집니다. 
• 둘째줄에각모험가의공포도값을 N이하의자연수로주어지며각자연수는 공백으로 구분합니다.
• 몇명의모험가는마을에그대로남아있어도됩니다. 모두넣을필요는없습니다.

출력조건 2
• 여행을떠날수있는그룹수의최댓값을출력합니다.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    //입력받아서 정렬하기=>최댓값을 구하려면 공포도가 낮은 사람부터 차곡차곡 인원을 채워넣어야 한다.
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    List<Integer> People = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int x = stdIn.nextInt();
      People.add(x);
    }
    Collections.sort(People);

    //총 그룹의 수
    int CountG = 0;
    //한 그룹의 사람수
    int memberC = 0;

    //입력받은 오름차순 공포도 리스트에 대해서
    for (int N:People) {
      memberC++; //그룹 인원수에 1을 더한다
      if (memberC >= N) { //만약 그룹 인원수가 공포도와 같거나 넘어선다면(조건 충족)
        CountG++; // 그룹이 완성된 것이므로 총 그룹수에 1을 더한다
        memberC = 0; // 다음 값 판단을 위해 초기화
      }
    }

    System.out.println(CountG); //목표인 최댓값 출력
  }
}
