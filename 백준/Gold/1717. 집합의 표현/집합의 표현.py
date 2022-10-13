import sys
sys.setrecursionlimit(100_000)

N, M = map(int, sys.stdin.readline().split())

p = [i for i in range(N+1)]


def find(a):
    if a == p[a]:
        return a

    p[a] = find(p[a])
    return p[a]


def union(a, b):
    pa = find(a)
    pb = find(b)
    if pa < pb:
        p[pb] = pa
    else:
        p[pa] = pb


for _ in range(M):
    op, a, b = map(int, sys.stdin.readline().split())

    if op == 0:
        union(a, b)
    else:
        if find(a) == find(b):
            print("YES")
        else:
            print("NO")
