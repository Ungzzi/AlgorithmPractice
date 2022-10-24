import sys

M, N = map(int, sys.stdin.readline().split())
dic = {}

for i in range(M):
    addr, pw = sys.stdin.readline().split()
    dic[addr] = pw

for j in range(N):
    k = sys.stdin.readline().split()[0]
    print(dic[k])
