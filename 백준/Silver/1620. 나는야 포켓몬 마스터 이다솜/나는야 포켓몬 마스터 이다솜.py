import sys

M, N = map(int, sys.stdin.readline().split())
dic = {}
dic2 = {}

for i in range(1, M+1):
    pokemon = sys.stdin.readline().split()
    dic[pokemon[0]] = i
    dic2[i] = pokemon[0]

for j in range(N):
    v = sys.stdin.readline().split()
    if v[0].isdigit() == True:
        print(dic2[int(v[0])])
    else:
        print(dic[v[0]])