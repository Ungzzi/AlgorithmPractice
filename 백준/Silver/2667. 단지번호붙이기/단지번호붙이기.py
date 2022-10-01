import sys
from collections import deque

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def bfs(g, N, y, x):
    q = deque()
    q.append((x,y))
    g[y][x] = 0
    cnt = 1

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx >= N or ny >= N:
                continue
            if g[ny][nx] == 1:
                g[ny][nx] = 0
                q.append((nx,ny))
                cnt += 1
    return cnt

N = int(sys.stdin.readline())
graph = []
for i in range(N):
    graph.append(list(map(int, sys.stdin.readline().split()[0])))

block = []
for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            block.append(bfs(graph, N, i, j))

block.sort()
print(len(block))
for num in block:
    print(num)