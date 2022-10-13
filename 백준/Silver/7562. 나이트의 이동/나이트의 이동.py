import sys
from collections import deque

dx, dy = [-2, -1, 1, 2, -2, -1, 1, 2], [1, 2, 2, 1, -1, -2, -2, -1]

t = int(sys.stdin.readline().split()[0])

for i in range(t):
    l = int(sys.stdin.readline().split()[0])
    board = [([0]*l) for _ in range(l)]

    x, y = map(int, sys.stdin.readline().split())
    tx, ty = map(int, sys.stdin.readline().split())

    q = deque()
    q.append((x, y))
    board[y][x] = 0

    while q:
        x, y = q.popleft()

        if x == tx and y == ty:
            answer = board[y][x]
            break

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= 0 and ny >= 0 and nx < l and ny < l  and board[ny][nx] == 0:
                board[ny][nx] = board[y][x] + 1
                q.append((nx, ny))

    print(answer)