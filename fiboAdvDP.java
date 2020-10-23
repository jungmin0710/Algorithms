import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    List<Integer>fiboList = new ArrayList<>();
    
    //1.피보나치수열 dp를 이용해서 만들기
    fiboList.add(1);//
    fiboList.add(1);
    for (int i = 2; i < n ; i++){
      fiboList.add(fiboList.get(i-1) + fiboList.get(i-2));
      }

    //2.n번째 피보나치 수열 값  
    System.out.println(n +"번째 피보나치 수열은 " +fiboList.get(n-1) + "입니다.");

    //3.n번째 까지의 피보나치 수열 개수
    System.out.println(n +"번째까지 피보나치 수열 개수는 " + fiboList.size() + "개 입니다.");

    //4.n번째 까지의 모든 피보나치 수열 나열하기
    System.out.print(n + "번째까지 모든 피보나치 수열 : ");
    System.out.println(fiboList.toString());

    //5.n번째까지의 모든 피보나치 수열 합계
    int s = 0;
    for (int i:fiboList){
      s += i;
    }
    System.out.println(n + "번째까지 모든 피보나치 수열의 합계는 " + s + "입니다.");
  }
}
