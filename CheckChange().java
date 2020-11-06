import java.util.*;

class Main {
  //올바른 괄호를 가지고 있는지 확인하기
  public static boolean is_correct(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++){ //입력된 문자열의 원소에 대해 
      if (s.charAt(i) == '(') count++; //여는괄호가 있으면 1씩 더하기
      else if (s.charAt(i) == ')'){ //닫는 괄호가 있으면 1씩 빼기(값이 존재할 때만)
        if (count > 0) count--;
        else return false; //값이 0이면 여는 괄호없이 닫는 괄호가 나온것이므로 false반환
      }
    }
    if (count != 0) return false; //반복이 끝난 후에도 값이 존재하면 둘의 수가 맞지않는것이므로 false반환
    else return true; // 값이 0이면 둘의 수가 맞으므로 true반환
  }

  //올바른 문자열로 만들기
  public static String make_correct(String p) {
    if (is_correct(p)) return p; //올바른 괄호를 가지고 있으면 그대로 반환

    int left = 0; //변수설정
    int right = 0;
    String u = "";
    String v = "";

    for (int i = 0; i < p.length();i++){ //u,v나누기 : 괄호가 올바른 괄호인 시점까지 u에 포함, 나머지는 v에 포함
      if (p.charAt(i) == '(') left++;
      else if (p.charAt(i) == ')') right++;
      if (left == right){ //갯수가 같아지는 시점 = 올바른 괄호인 시점
        u = p.substring(0,i+1);
        v = p.substring(i+1);
        break;
      }

    }
    if (v != "") v = make_correct(v); //재귀: v에 대해서 다시 수행하기

    if (!is_correct(u)) {//문자열 u가 올바른 괄호 문자열이 아닐 시 수행
      String new_s = '(' + v + ')';//재귀적 수행한 v문자열에 앞뒤로 괄호를 붙인다
      for (int j = 1; j <u.length()-1; j++){//u의 첫번재와 마지막 문자를 제거한 부분에 대해
        if (u.charAt(j) == '(') new_s += ')';// 나머지 문자열을 뒤집어 더한다
        else if (u.charAt(j) == ')') new_s += '('; 
      }
      return new_s;//문자열 최종반환
    }else return u+v;
  }

  public static void main(String[] args) {
    //입력받기
    Scanner stdIn = new Scanner(System.in);
    String w = stdIn.next();

    System.out.println(make_correct(w));
    
  }
}
