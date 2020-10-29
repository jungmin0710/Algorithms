import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //입력받아서 숫자 하나하나를 리스트화 시키기
    Scanner stdIn = new Scanner(System.in);
    String s = stdIn.next();
    String[] Number  = new String[s.length()];
    for (int i = 0; i < Number.length; i++){
      Number[i]= s.substring(i,i+1); // 문자열을 하나하나 잘라서 i번째에 넣는다(입력받을 때 int형으로 받을 경우 0이 앞쪽에오면 사라지므로 문자형으로 받음)
    }

    //계산하기: 숫자를 뒤집는 최소횟수는 숫자가 바뀌는 총 지점의 횟수를 2로나눈 수다.
    String num = Number[0];//초깃값(비교 기준 숫자)
    int count = 0;//숫자가 바뀌는 지점의 총 횟수

    for (int i = 1; i < Number.length; i++){
      if (num.equals(Number[i])) {//숫자가 같으면 pass(문자형이므로 equals를 사용)
          continue;
        }else{//숫자가 같지 않으면
          count++;//횟수 추가
          num = Number[i];//비교 숫자를 교체
      }
    }

    //출력하기
    int result = count/2;
    System.out.println(result);
  }
}
