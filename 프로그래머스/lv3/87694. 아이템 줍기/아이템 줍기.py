from collections import deque
from itertools import chain


def solution(rectangle, characterX, characterY, itemX, itemY):
    dx, dy = [0, 0, 1, -1], [1, -1, 0, 0]
    Max_size = 102
    board = [[-1] * Max_size for _ in range(Max_size)]
    for co in rectangle:
        co = list(map((lambda x: x*2), co))
        for i in range(co[1], co[3]+1):
            for j in range(co[0], co[2]+1):
                if co[1] < i < co[3] and co[0] < j < co[2]:
                    board[i][j] = 0
                elif board[i][j] != 0:
                    board[i][j] = 1

    q = deque()
    q.append([characterX * 2, characterY * 2])

    while q:
        x, y = q.popleft()

        if x == itemX * 2 and y == itemY * 2:
            answer = board[y][x] // 2
            break

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]

            if board[ny][nx] == 1:
                q.append([nx, ny])
                board[ny][nx] = board[y][x] + 1

    return answer
