#입력받기 + 정렬(최솟값이 여러개 나올 경우 앞 쪽 값을 먼저 산출)
n = int(input())
house = list(map(int,input().split(" ")))
s_house = sorted(house) 

#임시변수 설정
result = []
sum = 0

#거리값을 계산해서 리스트에 넣기
for i in range(n):
  for j in range(n):
    sum += abs(house[j]-house[i])
  result.append(sum)
  sum = 0

#결과 리스트의 값이 최솟값이면 해당 인덱스의 위치값 반환하기
for i in range(len(result)):
  if (result[i] == min(result)):
    answer = house[i]
    break;#만약 최솟값이 여러개에 해당하면 제일먼저 나온 값으로 반환
    
print(answer)

    
