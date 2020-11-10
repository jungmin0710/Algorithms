//옛날문제 중 grade_sort(JAVA) 파일 참고할 것
import java.util.*;

class Student implements Comparable<Student> {
  private String name;//변수정의
  private int korean;
  private int english;
  private int math;

  public Student(String name, int korean, int english, int math) {//생성자
    this.name = name;
    this.korean = korean;
    this.english = english;
    this.math = math;
  }
  
  public String getName() {//이름을 반환하는 메서드
    return this.name;
  }

  //정렬메서드 만들기  : 후순위 정렬부터 먼저 만들어야 결과물이 선순위 상태가 된다.
  //1.국어점수 내림차순(높은순)
  //2.영어점수 오름차순(낮은순)
  //3.수학점수 내림차순(높은순)
  //4.이름 오름차순(낮은순)
  @Override
  public int compareTo(Student Other) {
    if ((this.korean == Other.korean)&&(this.english == Other.english) && (this.math == Other.math)) return this.name.compareTo(Other.name);
    if ((this.korean == Other.korean) && (this.english == Other.english)) return Integer.compare(Other.math,this.math);
    //내림차순 정렬시 other객체들이 this보다 먼저와야함
    if ((this.korean == Other.korean)) return Integer.compare(this.english,Other.english);
    return Integer.compare(Other.korean,this.korean);
  }
}

class Main {
  //입력받기
  public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  ArrayList<Student> students = new ArrayList<>();
  for (int i = 0; i < n; i++) {
    String name = stdIn.next();
    int korean = stdIn.nextInt();
    int english = stdIn.nextInt();
    int math = stdIn.nextInt();
    students.add(new Student(name, korean, english, math));
   }

  Collections.sort(students);
  
  //이름만 출력하기
  for (int i = 0; i < n; i++) {
    System.out.println(students.get(i).getName());
   }

  }
}
