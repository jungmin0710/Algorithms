/*
두개의배열 A와 B를가지고있다. 두배열은 N개의원소로구성되어있으며 배열의원소는모두자연수이다. 최대 K번바꿔치기연산을수행할수있는데 바꿔치기연산이란 배열 A에 있는원소하나와배열 B에있는원소하나를골라서 두원소를서로바꾸는것을말한다.
최종목표는 배열 A의 모든원소의합이최대가되도록하는것이다.
• 첫번째줄에서 N, K가공백으로구분되어입력된다. • 두번째줄에배열 A의 원소들이공백으로구분되어입력된다. • 세번째줄에배열 B의원소들이공백으로 구분되어입력된다.
최대 K번바꿔치기 연산을수행하여만들수있는배열 A의 모든원소의합의 최댓값을출력한다.
*/



#include <bits/stdc++.h>

using namespace std;
int n, k;
vector<int> a, b;

bool compare(int x, int y) {
  return x > y;
}

int main(void) {
  //N과 k 입력받기
  cin >> n >> k;

  //배열 A의 모든 원소를 입력받기
  for (int i = 0; i < n; i++) {
    int x;
    cin >> x;
    a.push_back(x);
  }

  //배열 B의 모든 원소를 입력받기
  for (int i = 0; i < n; i++) {
    int x;
    cin >> x;
    b.push_back(x);
  }

  //배열 A는 오름차순 정렬 수행
  sort(a.begin(), a.end());

  //배열 B는 내림차순 정렬 수행
  sort(b.begin(), b.end(), compare);

  //첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 k번 비교
  for (int i = 0; i < k ; i++) {
    //A의 원소가 B의 원소보다 작은 경우
    if (a[i] < b[i]) swap(a[i], b[i]); //두 원소 교체
    //A의 원소가 B의 원소보다 크거나 같을 때 반복문 탈출
    else break;
  }

  //배열 A의 모든 원소의 합을 출력
  long long result = 0;
  for (int i = 0; i < n; i++) {
    result += a[i];
  }
  cout << result << "\n";
}
