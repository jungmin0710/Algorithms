/*
사용자 입력과 random함수를 사용하여, 사용자(user)와 컴퓨터가 대결하는 가위바위보 게임을 만들어보자.

입력:
가위
바위
보

출력:
결과반환
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();

    //사용자 입력받기
    System.out.println("가위, 바위, 보 중 입력하세요 : ");
    System.out.print("(당신)");
    String input = stdIn.next();

    int person = 0;
    person = input.equals("가위")? person:input.equals("바위")?person+1:person+2;

    //컴퓨터로 난수 발생
    int com = rand.nextInt(3);
    String comresult = com==0? "가위":com==1?"바위":"보";
    System.out.println("(컴퓨터)" + comresult);
    
    String result = "당신은 ";
    switch(person){
      case 0: 
        result = com==2? result+"이겼습니다!": com == 1? result+"졌습니다!": result+"비겼습니다!"; break;
      case 1: 
        result = com==0? result+"이겼습니다!": com == 2? result+"졌습니다!": result+"비겼습니다!"; break;
      case 2: 
        result = com==1? result+"이겼습니다!": com == 0? result+"졌습니다!": result+"비겼습니다!"; break;
    }

    System.out.println(result);

  }
}
