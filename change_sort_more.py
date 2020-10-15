####배열의 갯수까지 입력받아보기
#방법 1)
import numpy as np

M, N, K= map(int, input().split(" ")) 
#M : 배열의 개수/ N: 배열의 원소 개수/ K 교환 횟수

arr = [[0]*N for _ in range(M)] #_ : 값을 무시한다.
for i in range(M):
  arr[i] = [int(j) for j in input().strip().split()] 

#A와 나머지 리스트를 분리
a = arr[0]
act = arr[1:]

#A와 2차원배열안의 리스트를 오름차순으로 정렬
new_a = sorted(a)
np_act = np.array(act)
new_act = np.sort(np_act, axis = 1)

#A는 순서대로, 나머지 리스트는 반대로 요소를 비교한다
#(넘파이 2차원배열 안의 값까지 반대로 정렬하는 방법 있는지 나중에 검색해볼 것)

for x in range(K):
  for i in range(M-1):
    max_n = new_a[x]
    if new_act[i][N-1-x] > new_a[x]:
      max_n = new_act[i][N-1-x]
    new_a[x], max_n = max_n, new_a[x]

#합계 출력
print(sum(new_a))
