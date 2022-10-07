import sys
from collections import deque

dx, dy = [1, -1, 0, 0], [0, 0, 1, -1]

T = int(sys.stdin.readline())

def bfs(x, y):
    q = deque()
    q.append((x, y))
    farm[x][y] = 0

    while q:
        y, x = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx > M - 1 or ny < 0 or ny > N-1:
                continue

            if farm[ny][nx] == 1:
                farm[ny][nx] = 0
                q.append((ny, nx))

for i in range(T):
    cnt = 0
    M, N, K = map(int, sys.stdin.readline().split())
    farm = [[0]*M for _ in range(N)]
    for i in range(K):
        y, x = map(int, sys.stdin.readline().split())
        farm[x][y] = 1

    for i in range(N):
        for j in range(M):
            if farm[i][j] == 1:
                bfs(i, j)
                cnt += 1
    print(cnt)
