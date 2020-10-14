#두개의배열 A와 B를가지고있다. 두배열은 N개의원소로구성되어있으며 배열의원소는모두자연수이다. 
#최대 K번바꿔치기연산을수행할수있는데 바꿔치기연산이란 배열 A에 있는원소하나와배열 B에있는원소하나를골라서 두원소를서로바꾸는것을말한다.
#최종목표는 배열 A의 모든원소의합이최대가되도록하는것이다.

#첫번째줄에서 N, K가공백으로구분되어입력된다. 
#두번째줄에배열 A의 원소들이공백으로구분되어입력된다. 
#세번째줄에배열 B의원소들이공백으로 구분되어입력된다.
#최대 K번바꿔치기 연산을수행하여만들수있는배열 A의 모든원소의합의 최댓값을출력한다.



########방법1)
#입력받은 두 수를 공백을 기준으로 잘라 정수로 만든다.
Input = input().split(" ")
N , K = int(Input[0]), int(Input[1])

#문자형으로 입력된 수 정보를 공백을 기준으로 잘라 리스트로 만든다.
list_A = input().split(" ")
list_B = input().split(" ")

#문자의 리스트를 정수형 리스트로 변환한다.
int_list_A = []
int_list_B = []
for i in range(N):
  int_list_A.append(int(list_A[i]))
  int_list_B.append(int(list_B[i]))

#A리스트는 오름차순으로, B리스트는 내림차순으로 정렬한다.(A리스트의 작은 값을 B리스트의 큰 값으로 바꾸기 위함 => A의 합계를 가장 큰 수로 출력하기 위해서)
new_A = sorted(int_list_A)
new_B = sorted(int_list_B, reverse=True)

#K번만큼 A와 B 리스트의 요소를 앞에서부터 비교해 A에 들어있는 요소가 작으면 B와 교체한다.
for i in range(K):
  if new_A[i] < new_B[i]:
    new_A[i], new_B[i] = new_B[i], new_A[i]

#A의 합계 출력
print(sum(new_A))
