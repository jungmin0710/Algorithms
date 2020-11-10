student = []

n = int(input())
for i in range(n):
  student.append(input().split())

#1.국어점수 내림차순(높은순)
#2.영어점수 오름차순(낮은순)
#3.수학점수 내림차순(높은순)
#4.이름 오름차순(낮은순)
student.sort(key=lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))
for i in range(n):
  print(student[i][0])
  
