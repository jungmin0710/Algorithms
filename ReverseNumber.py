#입력받아서 숫자 하나하나를 (비교를 위해)리스트화 시키기
Number_list = list(input())

#계산하기 : 숫자를 뒤집는 최소 횟수는 숫자가 바뀌는 지점을 2로 나눈 수와 같다.(예외가 있을수도....? )
num = Number_list[0]#초깃값(비교 기준 숫자)
count = 0#숫자가 바뀌는 지점 계산

for i in range(1,len(Number_list)):
  if num != Number_list[i]:
    count += 1
    num = Number_list[i]

result = int(count/2)#결과값 : 숫자를 뒤집는 최소횟수

print(result)
