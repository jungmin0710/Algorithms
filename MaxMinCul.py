#방법1
N = int(input())
nums = list(map(int, input().split()))
add, mns, mul, div = map(int, input().split())

minR = 1e9
maxR = -1e9

def Solution(i, j, add, mns, mul, div):
    global maxR, minR
    if i == N:
        maxR = max(j, maxR)
        minR = min(j, minR)
        return

    else:
        if add:
            Solution(i+1, j+nums[i], add-1, mns, mul, div)
        if mns:
            Solution(i+1, j-nums[i], add, mns-1, mul[2], div[3])
        if mul:
            Solution(i+1, j*nums[i], add, mns, mul-1, div)
        if div:
            Solution(i+1, int(j/nums[i]), add, mns, mul, div-1)

Solution(1, nums[0], add, mns, mul, div)
print(maxR)
print(minR)


#방법2
n = int(input())
arr = list(map(int,input().split()))
add, sub, mul, div = map(int,input().split())

minValue = 1e9
maxValue =-1e9

def dfs(i, now):
  global minValue, maxValue,add,sub,mul,div
  if i == n:
    minValue = min(minValue,now)
    maxValue = max(maxValue,now)
    return
  else:
    if add:
      add -= 1
      dfs(i+1, now+arr[i])
      add += 1
    if sub:
      sub -= 1
      dfs(i+1, now-arr[i])
      sub += 1
    if mul:
      mul -= 1
      dfs(i+1, now*arr[i])
      mul += 1
    if div:
      div -= 1
      dfs(i+1, now//arr[i])
      div += 1

dfs(1,arr[0])
print(maxValue)
print(minValue)
