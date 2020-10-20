/*

개미전사는부족한식량을충당하고자메뚜기마을의식량창고를몰래공격하려고한다. 
메뚜기마을에는여러개의식량창고가있는데식량창고는일직선으로이어져있다. 
각식량창고에는정해진수의식량을저장하고있으며개미전사는식량창고를 선택적으로약탈하여식량을빼앗을예정이다. 
이때메뚜기정찰병들은일직선상에존재하는 식량창고중에서서로인접한식량창고가공격받으면바로알아챌수있다. 
따라서개미전사가 정찰병에게들키지않고식량창고를약탈하기위해서는최소한한칸이상떨어진식량창고를 약탈해야한다. 
개미전사를위해식량창고 N개에대한정보가주어졌을때얻을수있는식량의최댓값을 구하는프로그램을작성하시오.

입력조건 
• 첫째줄에식량창고의개수 N이주어진다. 
• 둘째줄에공백으로구분되어각식량창고에저장된식량의개수 K가주어진다.

출력조건 
• 첫째줄에개미전사가얻을수있는식량의최대값을출력하시오.

*/



import java.util.Scanner;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] array = new int[n];
    
    for (int i = 0; i < n ; i++) {
      array[i] = stdIn.nextInt();
    }

    int[] d = new int[n];
    d[0] = array[0];
    d[1] = Math.max(array[0],array[1]);

    for (int i = 2; i < n ; i++ ){
      d[i] = Math.max(d[i-1], d[i-2] + array[i]);
    }

    System.out.println(d[n-1]);
  }
}
