
#한 마을에 모험가가 N명 있습니다. 
#모험가 길드에는 N명의 모험가를 대상으로 ‘공포도’를 측정했는데  ‘공포도’가 높은 모험가는 쉽게 공포를 느껴 위험상황에서 제대로 대처할 능력이 떨어집니다.
#모험가 길드장인 스틴이는 모험가그룹을 안전하게 구성하고자  공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정했습니다. 
#스틴이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금합니다.
#스틴이를위해 N명의 모험가에 대한 정보가 주어졌을 때 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하세요.

#입력조건 5/ 2 3 1 2 2
#• 첫째줄에모험가의수N이주어집니다. 
#• 둘째줄에각모험가의공포도값을 N이하의자연수로주어지며각자연수는 공백으로 구분합니다.
#• 몇명의모험가는마을에그대로남아있어도됩니다. 모두넣을필요는없습니다.

#출력조건 2
#• 여행을떠날수있는그룹수의최댓값을출력합니다.





#입력받아 정렬
n = int(input()) 
people = list(map(int, input().split())) 
people.sort()

CountG = 0 #총 그룹의 수
memberC = 0 # 한 그룹의 사람수
for i in people:  #입력받은 공포도에 대하여
  memberC += 1  #그룹 인원수에 1을 더한다
  if memberC >= i: #만약 그룹 인원수가 공포도와 같거나 넘어서면(조건 충족)
    CountG += 1 #(그룹이 완성되었으므로) 총 그룹수에 1을 더한다
    memberC = 0 #초기화
print(CountG) #목표인 최댓값을 출력한다.
