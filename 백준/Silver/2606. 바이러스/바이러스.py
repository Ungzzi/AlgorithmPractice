import sys
from collections import deque

n = int(sys.stdin.readline())
v = int(sys.stdin.readline())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for i in range(v):
    n1, n2 = map(int, sys.stdin.readline().split())
    graph[n1].append(n2)
    graph[n2].append(n1)

queue = deque([1])
visited[1] = True
cnt = 0

while queue:
    cur = queue.popleft()
    for i in graph[cur]:
        if not visited[i]:
            queue.append(i)
            visited[i] = True
            cnt += 1
print(cnt)