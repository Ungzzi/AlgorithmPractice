import sys

n, k = map(int, sys.stdin.readline().rsplit(' '))
coin = []
for i in range(n):
    coin.append(int(sys.stdin.readline()))
dp = [10001]*(k+1)
dp[0] = 0

for i in coin:
    for j in range(i, k+1):
        dp[j] = min(dp[j], dp[j-i]+1)

if dp[k] == 10001:
    print(-1)
else:
    print(dp[k])