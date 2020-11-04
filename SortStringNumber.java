// 문자와 숫자가 섞인 문자열을 입력받아 문자는 오름차순으로, 숫자는 총 합계가 제일 뒤에 오도록 출력하기

import java.util.*;

class Main {

  public static String str;
  public static ArrayList<Character> result = new ArrayList<Character>();
  public static int value = 0;

  public static void main(String[] args) {

//입력받아서 숫자면 합계에 더하고, 알파벳이면 리스트에 넣기
    Scanner sc = new Scanner(System.in);
    str = sc.next();
    for (int i = 0; i < str.length(); i++){
      if ( ( 0 <= str.charAt(i) - '0' ) && ( str.charAt(i) - '0' <= 9 ) ){
        value += (str.charAt(i) - '0');
      }else {
        result.add(str.charAt(i));
      }
    }

//정렬해서 출력
    Collections.sort(result);

    for (char i:result){
      System.out.print(i);
    }
      System.out.println(Integer.toString(value));
      
    
  }
}

/*
2번부분(순서 반대로)
    Scanner sc = new Scanner(System.in);
    str = sc.next();
    for (int i = 0; i < str.length(); i++){
      if (Character.isLetter(str.charAt(i))){
        result.add(str.charAt(i));
      }else {
        value += str.charAt(i) - '0';
      }
    }


*/
