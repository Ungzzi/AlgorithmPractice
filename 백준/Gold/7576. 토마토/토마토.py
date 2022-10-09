import sys
import itertools
from collections import deque

dx, dy = [0, 0, -1, 1], [-1, 1, 0, 0]
M, N = map(int, sys.stdin.readline().split())
q = deque()
box = []

for i in range(N):
    box.append(list(map(int, sys.stdin.readline().split())))

for i in range(M):
    for j in range(N):
        if box[j][i] == 1:
            q.append((i, j))

while q:
    x, y = q.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or ny < 0 or nx > M - 1 or ny > N - 1:
            continue

        if box[ny][nx] == 0:
            box[ny][nx] = box[y][x] + 1
            q.append((nx, ny))

box2 = list(itertools.chain(*box))
if 0 in box2:
    day = -1
else:
    day = max(box2) - 1

print(day)