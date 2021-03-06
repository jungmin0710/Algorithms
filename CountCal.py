#정수 X가주어졌을 때, 정수 X에사용할수있는연산은다음과같이 4가지입니다. 
#• X가 5로나누어떨어지면 5로나눕니다. 
#• X가 3으로나누어떨어지면 3으로나눕니다. 
#• X가 2로나누어떨어지면 2로나눕니다. 
#• X에서 1을뺍니다.

#정수 X가주어졌을 때, 연산 4개를적절히사용해서값을 1로만들고자합니다. 연산을사용하는횟수의최솟값을출력하세요.

#입력조건 
#• 첫째줄에정수 X 가주어진다.
#출력조건 
#• 첫째줄에연산을하는횟수의최솟값을출력한다.

#입력예시 26
#출력예시 3


#연산횟수를 세는 함수를 만든다
def countC(x):
  d = [0] * 1000001
  #다이나믹프로그래밍 배열 만들기
  for i in range(2,x+1):
    d[i] = d[i-1]+1
  #연산 1에 해당하는 값을 넣어둔다
    if i%2 == 0:
      d[i] = min(d[i],d[i//2]+1)
  #2의 배수에 해당하는 인덱스 연산횟수 갱신
    if i%3 == 0:
      d[i] = min(d[i], d[i//3]+1)
  #3의 배수에 해당하는 인덱스 연산횟수 갱신
    if i%5 == 0:
      d[i] = min(d[i], d[i//5]+1)
  #5의 배수에 해당하는 인덱스 연산횟수 갱신
  return d[x]# 마지막 인덱스의 값을 출력

x = int(input())
print(countC(x))
