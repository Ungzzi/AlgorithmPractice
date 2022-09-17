from collections import deque
import sys

q_len, s_len = map(int, sys.stdin.readline().split())
q_target = deque(map(int, sys.stdin.readline().split()))
dq = deque(i for i in range(1, q_len+1))
cnt = 0
r_cnt = 0
answer = 0

while q_target:
    # q 맨앞이 추출하려는 수랑 같을때
    if dq[0] == q_target[0]:
        if r_cnt <= len(dq) // 2:
            answer += r_cnt
        else:
            answer += (len(dq) - r_cnt)
        dq.popleft()
        q_target.popleft()
        r_cnt = 0

    # 다를때
    else:
        dq.rotate(1)
        r_cnt += 1

print(answer)