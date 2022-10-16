import sys
from collections import deque


def bfs(n):
    q = deque()
    q.append(n)
    visited = [False] * (N+1)
    visited[n] = True
    bacon = [0] * (N+1)

    while q:
        x = q.popleft()

        for i in dic[x]:
            if visited[i] == False:
                visited[i] = True
                bacon[i] = bacon[x] + 1
                q.append(i)
    return sum(bacon)


N, M = map(int, sys.stdin.readline().split())
dic = [[] for _ in range(N+1)]

for i in range(M):
    R1, R2 = map(int, sys.stdin.readline().split())
    dic[R1].append(R2)
    dic[R2].append(R1)

result = []
for i in range(1, N+1):
    result.append(bfs(i))

print(result.index(min(result))+1)