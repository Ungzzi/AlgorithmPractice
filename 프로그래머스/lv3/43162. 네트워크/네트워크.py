def solution(n, computers):
    p = [i for i in range(n)]

    def find(p, x):
        if p[x] != x:
            p[x] = find(p,p[x])
        return p[x]

    def union(x, y):
        px = find(p,x)
        py = find(p,y)

        if px < py:
            p[py] = px
        else:
            p[px] = py

    for i in range(n):
        for j in range(n):
            if computers[i][j] == 1:
                union(i, j)

    for i in range(n):
        find(p, i)

    return len(set(p))