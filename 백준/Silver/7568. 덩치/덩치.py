from collections import deque

n = int(input())

info = []
rank = []

for i in range(n):
    t, w = map(int, input().split(" "))
    info.append((t, w))

for i in range(n):
    cnt = 0
    for j in range(n):
        if info[i][0] < info[j][0] and info[i][1] < info[j][1]:
            cnt += 1
    rank.append(cnt + 1)

for k in rank:
    print(k)
