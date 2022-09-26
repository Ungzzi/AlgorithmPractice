import sys
from collections import deque

n = int(sys.stdin.readline())
p1, p2 = map(int, sys.stdin.readline().split())
v = int(sys.stdin.readline())
result = []
cnt = 0

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for i in range(v):
    n1, n2 = map(int, sys.stdin.readline().split())
    graph[n1].append(n2)
    graph[n2].append(n1)


def DFS(graph, p1, cnt):
    cnt += 1
    visited[p1] = True

    for i in graph[p1]:
        if i == p2:
            result.append(cnt)
            break
        if not visited[i]:
            DFS(graph, i, cnt)


DFS(graph, p1, cnt)
if len(result) == 0:
    print(-1)
else:
    print(result[0])
