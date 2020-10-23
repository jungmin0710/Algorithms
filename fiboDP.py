#피보나치 수열을 다이나믹 프로그래밍으로 구현하라!

#n번째 피보나치 수열 구하기 : n 입력받기
n = int(input())

#dp배열 n인덱스까지 만들기
dp = [100001] * (n+1)
dp[0] = 0; dp[1] = 1  #초기 숫자를 0과 1로 배치한다

for i in range(2, n+1): #2부터 n까지
  dp[i] = dp[i-2] + dp[i-1] #i번째 수는 i-2번째와 i-1번째를 더한 수다

print(dp[n])  #목표인 n번 인덱스를 출력한다.


