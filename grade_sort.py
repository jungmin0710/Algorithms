#####방법 1) 딕셔너리 사용해서 정렬하기

#입력받을 학생수 N 받기
N = int(input())
x = []
grade_list = []
name_list = []

#N만큼 학생의 정보를 입력받아 2차원배열로 x에 보관
for i in range(N):
  n = input().split()
  x.append(n)

#이름과 성적으로 분리해서 리스트를 만듦
for i in range(len(x)):
  name_list.append(x[i][0])
  grade_list.append(int(x[i][1]))

#딕셔너리 형태로 두 리스트를 엮는다
grade_name_dict = dict(zip(grade_list, name_list))

#성적(키 값)을 기준으로 오름차순 정렬
new_grade_name_Tlist = sorted(grade_name_dict.items())

#min_index = grade_name_dict[0]
#for i in range(i+1,len(grade_name_dict)):
#   if grade_name_dict[i][0] < grade_name_dict[min_index][0]:
#     min_index = i
#


#성적이 낮은 순서대로 이름을 출력한다
for i in new_grade_name_Tlist:
  print(i[1], " ", end='')


  

##### 방법2) 내장함수 없이 2차원배열로 정렬하기

#N만큼의 수를 정수로 입력받기
N = int(input())
x = []

#N만큼 학생의 정보를 x에 2차원배열로 저장
for i in range(N):
  n = input().split()
  x.append(n)

#최솟값이 들어있는 위치를 찾는다
for i in range(len(x)):
  min_index = i
  for j in range(i+1,len(x)):
    if x[j][1] < x[min_index][1]:
      min_index = j

#임시변수 t를 사용해 최솟값과 비교기준값의 위치를 계속 교환한다
  t = [x[i][0],x[i][1]]
  [x[i][0],x[i][1]] = [x[min_index][0],x[min_index][1]]
  [x[min_index][0],x[min_index][1]] = t

#이름 부분만 오름차순으로 출력
for i in range(len(x)):
  print(x[i][0], " ", end = '')
  
  
  
  ##### 방법3) 내장함수를 사용해 정렬하기
  
n = int(input())

array = []
for i in range(n):
  input_data = input().split()
  array.append((input_data[0],int(input_data[1])))

array = sorted(array, key = lambda student: student[1])

for student in array : print(student[0], " ", end = '')
