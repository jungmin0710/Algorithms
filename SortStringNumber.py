#문자와 숫자가 섞인 문자열을 입력받아 문자는 오름차순으로, 숫자는 총 합을 맨 뒤에 출력하기

data = input()
result = []
value = 0

for i in range(len(data)):
  if data[i].isdigit():
    value += int(data[i])
  else:
    result.append(data[i])

sorted_result = sorted(result)

for s in sorted_result:
  print(s, end='')
print(value)
