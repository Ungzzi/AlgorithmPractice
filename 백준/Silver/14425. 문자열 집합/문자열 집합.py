import sys

N, M = map(int, sys.stdin.readline().split())
arr_s = [input() for _ in range(N)]
check = [input() for _ in range(M)]
_dict = {}
cnt = 0

for i in range(N):
    _dict[arr_s[i]] = i

for j in range(M):
    if check[j] not in _dict:
        continue
    else:
        cnt += 1

print(cnt)
