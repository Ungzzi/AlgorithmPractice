from collections import deque
import sys

case = int(sys.stdin.readline())

for i in range(case):
    N, K = map(int, sys.stdin.readline().strip().split())
    p_list = list(map(int, sys.stdin.readline().strip().split()))
    priorities = sorted(p_list, reverse=True)
    q = deque((i, p) for i, p in enumerate(p_list))
    cnt = 1

    for j in range(len(priorities)):
        while priorities[j] != q[0][1]:
            q.rotate(-1)
        if q.popleft()[0] == K:
            print(cnt)
        cnt += 1
