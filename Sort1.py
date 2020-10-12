#단순선택법으로 배열 정렬하기
array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)):
  min_index = i     #가장 작은 숫자의 인덱스이자 비교 할 기준 숫자
  for j in range(i+1,len(array)):     #기준숫자 다음 자리부터 끝까지의 범위((비교대상 탐색할 범위)
    if array[min_index] > array[j]:     #기준숫자보다 해당숫자가 작으면
      min_index = j     #가장 작은 숫자의 인덱스를 바꾼다.(계속해서 전체범위 탐색)

  #가장 작은 숫자 인덱스와 기준 숫자의 자리를 바꾼다.
  t = array[i]      #임시변수
  array[i] = array[min_index]
  array[min_index] = t

  ##이렇게도 가능
  ##array[i], array[min_index] = array[min_index], array[i]  =>>간단하게 교환가능(파이썬에서만 해당)

print(array)
