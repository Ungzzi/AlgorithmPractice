from collections import deque

dx, dy = [0, 0, -1, 1], [-1, 1, 0, 0]


def solution(maps):
    answer = 0
    w = len(maps[0])
    h = len(maps)
    q = deque()
    q.append([0, 0])
    flag = False

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= 0 and ny >= 0 and nx < w and ny < h and maps[ny][nx] == 1:
                maps[ny][nx] = maps[y][x] + 1
                q.append([nx, ny])
            
            if nx == w - 1 and ny == h - 1:
                answer = maps[ny][nx]
                flag = True
                break

    if flag == False:
        return -1
    else:
        return answer