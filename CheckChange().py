def solution(p):
  #올바른 괄호를 가지고 있는지 확인하기
  def is_correct(s):
      count = 0
      for i in s:#입력된 문자열의 원소에 대해
          if i == '(':#여는괄호가 있으면 1씩더하기
              count += 1
          elif i == ')':
              if count:#닫는괄호가 있으면 1씩 빼기(값이 존재하면)
                  count -= 1
              else:#값이 존재하지 않으면(0)이면 여는 괄호없이 닫는 괄호가 나온것이므로 False반환
                  return False
      if count:#반복이 끝난 후에도 값이 존재하면 둘의 수가 맞지 않으므로 False반환  
        return False
      else:#값이 존재하지않으면 True반환(0이므로)
        return True

  #올바른 문자열 만들기
  def make_correct(p):
      if is_correct(p):#올바른 괄호를 가지고 있으면 그대로 반환
          return p
      left, right = 0, 0 #양 쪽의 총 갯수를 판단할 변수
      u, v = '', '' #분리해서 담을 문자열 변수
      # u, v 나누기
      for i in range(len(p)):#괄호가 올바른 괄호인 시점까지 u에 포함, 나머지는 v에 포함시킨다.
        if p[i] == '(':
            left += 1
        elif p[i] == ')':
            right += 1
        if left == right:#갯수가 같아지는 시점 = 올바른 괄호인 시점
            u, v = p[:i+1], p[i+1:]
            break

      if v: #재귀(v에 대해 다시수행)
          v = make_correct(v)

      if not is_correct(u): #문자열 u가 올바른 괄호 문자열이 아닐 시 수행
          new_s = '(' + v + ')' #재귀적 수행한 v문자열에 앞뒤로 괄호를 붙인다
          for b in u[1:-1]: #u의 첫번째와 마지막 문자를 제거한 부분에 대해서
              if b == '(':  #나머지 문자열들을 뒤집어 더한다
                  new_s += ')'
              elif b == ')':
                  new_s += '('
          return new_s #문자열 최종반환
      else:
          return u + v

  return make_correct(p)

print(solution(input()))
