#입력받아서 2차원 배열로 저장
n = int(input())
arr = []
for i in range(n):  
  x = list(map(int,input().split()))
  arr.append(x)

#합계 계산하기
m = 2#배열의 2번째 행의 인덱스는 0,1이므로 초기값을 2로 설정한다.
for i in range(1,n):
  for j in range(m):
    if j == 0:#맨 왼쪽 숫자면 자기자신과 자기자리와 같은 인덱스 숫자를 더한다 
      arr[i][j] = arr[i][j] + arr[i-1][j]
    elif i == j:#맨 오른쪽 숫자면 자기자신과 자기자리 바로 전 인덱스 숫자를 더한다
      arr[i][j] = arr[i][j] + arr[i-1][j-1]
    else:#아니면 자기자신과, 양 숫자중 큰 숫자인 경우를 더한다
      arr[i][j] = max(arr[i-1][j-1],arr[i-1][j]) + arr[i][j]
  m += 1 #다음 행에서 숫자를 증가시킨다

#2차원배열의 마지막 행에 나오는 값들 중 최댓값을 출력한다
print(max(arr[n-1]))
