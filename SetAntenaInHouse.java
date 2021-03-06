//방법 1: 합계를 전체 계산해서 답을 산출

import java.util.*;

class Main {
  public static void main(String[] args) {
    //입력받기 + 정렬(최솟값이 여러개 나올 경우 앞 쪽 값을 먼저 산출)
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] house = new int[n];

    for(int i = 0; i < n; i++) {
      house[i] = stdIn.nextInt();
    }
    Arrays.sort(house);

    //임시변수 설정
    int[] result = new int[n];
    int sum = 0;

    //거리 값을 계산해서 리스트에 넣기
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        sum += Math.abs(house[j]-house[i]);
      }
      result[i] = sum;
      sum = 0;
    }

    int answer = house[0];
    for (int i = 1; i < n; i++) {
      if (result[i] < result[i-1]) {
        answer = house[i];
      }
    }

    System.out.println(answer);
  }
}



//방법 2: 중간값을 내어 결과 산출

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt();
    ArrayList<Integer> arrayList = new ArrayList<>(); 
    
    for (int i = 0; i < n; i++) { 
      arrayList.add(sc.nextInt());
      } 
      
      Collections.sort(arrayList);

    // 중간값(median)을 출력 
    System.out.println(arrayList.get((n - 1) / 2));
  }   
}

