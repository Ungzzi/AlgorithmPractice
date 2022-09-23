import sys

N, K = map(int, sys.stdin.readline().split())
coin_list = []
for i in range(N):
    coin_list.append(int(sys.stdin.readline()))
coin_list.sort(reverse=True)

cnt = 0
for j in range(N):
    cnt += K//coin_list[j]
    K = K % coin_list[j]
print(cnt)