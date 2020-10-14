//n만큼의 학생이름과 성적정보를 입력받아 오름차순으로 정렬한 후 이름만 출력하기


/*

import java.util.*;

class Main {
  public static void main(String[] args) {

    //ArrayList라는 리스트 자료형에 객체를 생성한다
    ArrayList<Integer> point = new ArrayList<Integer>();
    point.add(98);
    point.add(24);
    point.add(56);
    point.add(78);

    //Collections의 sort함수를 이용해 배열을 던져준다.(오름차순 정렬)
    //Collections.sort(point);

    //내림차순 정렬
    Collections.sort(point, Collections.reverseOrder());

    for (int i : point) System.out.print(i + " ");
  }
}

/*

어느 자료형에서나 그대로 가져다 쓰지 못하는 이유?
기본 : 오름차 순 정렬
implements Comparable<students> =>> 인터페이스를 통해 리스트 자료형을 받아옴
그러나 이것은 기본기능으로만 쓰기 힘들고 부가기능을 추가하여야 함(정렬할 자료가 리스트형인데다가 정렬 기준이 제일 앞자리가 아닌 그 다음 자리이기 때문=>> 인터페이스로 넘겨서 해결하기)
@override 기본기능을 받아오기 위해 걸어줘야함
compareTo라는 함수로 내부자료를 정렬함(이는 아직 이해가 어려움)



*/

import java.util.*;

class Student implements Comparable<Student> {
  private String name;
  private int score;
  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return this.name;
  }

  public int getScore(){
    return this.score;
  }
  
  // 정렬기준은 점수의 오름차순
  @Override
  public int compareTo(Student other) {
    if (this.score < other.score) {
      return -1;
    }
    return 1;
  }
}

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Student> students = new ArrayList<>();
    for (int i  = 0; i < n; i++) {
      String name = sc.next();
      int score = sc.nextInt();
      students.add(new Student(name,score));
    }

    Collections.sort(students);
    //


    for (int i = 0; i < students.size(); i++) {
      System.out.print(students.get(i).getName() + " ");
    }
  }
}

*/
