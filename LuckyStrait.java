/*

입력된 숫자가 짝수이고, 반반 양쪽의 값이 같으면 lucky기술 사용
아니면 ready사용
짝수가 아니면 다시입력받기

*/



import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    String N;
    int left=0;
    int right=0;
  
    do{
      System.out.print("숫자를 입력해주세요 : ");
      N = stdIn.next();
      int[] Number  = new int[N.length()];

      if (N.length() % 2 == 0) {
          
        for (int i = 0; i < Number.length; i++){
          Number[i]= Integer.parseInt(N.substring(i,i+1));
        }
          
        for (int j= 0; j < Number.length; j++){
          if ((j+1) <= (Number.length/2)) {left = left + Number[j];}
          else {right = right + Number[j];}
        }  

        if (right == left) {System.out.println("LUCKY");}
        else {System.out.println("READY");}

      }else {
        System.out.println("입력되는 숫자의 자릿수가 홀수입니다. 짝수로 입력해 주세요.");
      }
    }while (N.length() % 2 == 1);
  }
}
