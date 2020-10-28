/*
버블 정렬: 두 수를 비교해서 큰 수는 오른쪽으로 이동시키는 방법을 이용한다. (마지막 인덱스부터 고정된다)
j 한바퀴가 끝나면 마지막 인덱스의 값이 확정된다
이후 차례에는 0부터 n-i만큼 정렬을 다시 시작한다.
작은 수로부터 큰 수로 순서 정렬

퀵정렬: 기준값을 찾고 기준값보다 작은 값들은 왼쪽, 큰 값들은 오른쪽으로 보낸다. 나누고 이동하는 것을 반복한다(=>재귀를 사용함)
빠른 속도가 특징이다.

삽입정렬:아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적절한 위치에 삽입해 가며 정렬하는 방식

선택정렬: 제일 작은 수를 찾아 앞으로 픽스
*/

class Main {
  public static void Bubble(int[] n){//버블정렬
    for (int i = 0; i < n.length-1; i++){
      for (int j = 0; j < n.length-1-i;j++){
        if (n[j] > n[j+1]){
          int temp = n[j];
          n[j] = n[j+1];
          n[j+1] = temp;
        }
      }
    }
    print(n);
  }

  public static void Quick(int[] n, int start, int end){//퀵정렬
    int left = start;
    int right = end;//계속 변수의 값이 바뀐다.
    int mid = n[(start+end)/2]; //중앙값은 시작+끝/2 를 주로 사용한다.(기준값)

    do{
      while ((n[left] < mid) && (left < end)){
        left++;
      }
      while ((mid < n[right]) && (right > start)){
        right--;
      }
      if (left <= right){
        int temp = n[left];
        n[left] = n[right];
        n[right] = temp;
        left++;
        right--;
      }
    }while(left < right);

    //재귀처리
    if (start<right) {
      Quick(n,start,right);
    }
    if (left<end){
      Quick(n,left,end);
    }
  }

//삽입정렬
  public static void Insert(int[] n){
    for (int i = 0; i < n.length; i++){
      int temp = n[i];
      int j = i - 1;
      while (j >= 0 && n[j] > temp){
        n[j+1] = n[j];
        j--;
      }
      n[j+1] = temp;
    }
  }

//선택정렬
  public static void Select(int[] n){
    for (int i = 0; i < n.length; i++){
      int k = i;
      for (int j = i+1; j < n.length; j++){
        if (n[j] < n[k]){
          k = j;
        }
      }
      int temp = n[i];
      n[i] = n[k];
      n[k] = temp;
    }
  }

  public static void print(int[] n){
    for (int i = 0; i <n.length; i++){
      System.out.print(n[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] n = {2,3,4,1,2}; //5개
    System.out.println("-----------------------");
    //Bubble(n);
    //Quick(n,0,n.length-1);
    //Insert(n);
    Select(n);
    print(n);
    
  }
}
