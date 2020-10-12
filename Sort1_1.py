#입력받을 개수를 입력받기
N = int(input())
N_list = [] #입력받을 숫자를 넣을 리스트

#N개만큼 입력받기
for i in range(N): 
  x = int(input())
  N_list.append(x)

#내림차순으로 정렬
N_list.sort()
N_list.reverse()


print(N_list)
