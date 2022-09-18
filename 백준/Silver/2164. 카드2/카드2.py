from collections import deque
import sys

n = int(sys.stdin.readline().strip())
q = deque(i for i in range(1, n+1))

while len(q) >= 2:
    q.popleft()
    q.rotate(-1)
print(q[0])