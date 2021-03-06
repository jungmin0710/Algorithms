#각 자리가 숫자(0부터9)로만 이루어진 문자열 S가 주어졌을 때, 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 ‘*’ 혹은 ‘+’ 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하세요.
#단 + 보다 *를 먼저 계산하는 일반적인 방식과는 달리 모든 연산은 왼쪽으로부터 순서대로 이루어진다고 가정합니다.
#예를 들어 02984라는 문자열이 주어지면, 만들어질 수 있는 가장 큰 수는 ((((0+2)*9)*8)*4 = 576 입니다.
#입력 조건 02984 / 567
#• 첫째 줄에 여러개의 숫자로 구성된 하나의 문자열 S가 주어집니다.
#출력 조건 576 / 210
#• 첫째 줄에 만들어질 수 있는 가장 큰 수를 출력합니다.

SNumber = list(input())
Number = list(map(int, SNumber))

result = Number[0]

for i in range(1,len(Number)):
  if (Number[i] == 0) or (Number[i] == 1) or (result == 0) or (result == 1):
    result += Number[i]
  else:
    result *= Number[i]

print(result)

