from collections import deque
import sys

N, K = map(int, sys.stdin.readline().strip().split())
q = deque(str(i) for i in range(1, N+1))
answer = []

while q:
    q.rotate(-K+1)
    answer.append(q.popleft())
print("<"+', '.join(answer)+">")
