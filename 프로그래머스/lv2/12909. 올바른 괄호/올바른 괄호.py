def solution(s):
    # 빈 스택 생성
    stack = []

    # 문자열에서 반복적으로 하나씩 꺼냄
    for item in s:
        # 꺼낸 문자가 '(' 면 빈스택에 추가
        if(item == '('):
            stack.append(item)
        # 꺼낸 문자가 ')' 일 경우
        elif(item == ')'):
            # 스택이 비어있으면 False
            if(len(stack) == 0):
                return False
            # 스택이 안비어있으면 '(' pop
            else:
                stack.pop()

    # 최종적으로 stack 안에 아무것도 없는 상태여야 True를 리턴해줌
    if(len(stack) != 0):
        return False
    else:
        return True