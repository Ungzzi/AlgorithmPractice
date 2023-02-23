def solution(n, results):
    answer = 0
    win = [[0] * n for _ in range(n)]
    lose = [[0] * n for _ in range(n)]
    
    for x, y in results:
        win[x-1][y-1] = 1
        lose[y-1][x-1] = 1

    for i in range(n):
        for j in range(n):
            for k in range(n):
                if (win[j][i] == 1 and win[i][k]):
                    win[j][k] = 1

    for i in range(n):
        for j in range(n):
            for k in range(n):
                if (lose[j][i] == 1 and lose[i][k]):
                    lose[j][k] = 1


    for i in range(n):
        temp = 0
        for j in range(n):
            if (win[i][j] == 0 and lose[i][j] == 0 and i != j):
                break
            else:
                temp += 1
        if temp == n:
            answer += 1

    return answer