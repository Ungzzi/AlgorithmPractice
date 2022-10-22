import sys

N, M = map(int, sys.stdin.readline().split())
no_watch = set()
no_see = set()

for i in range(N):
    no_watch.add(sys.stdin.readline().split()[0])

for i in range(M):
    no_see.add(sys.stdin.readline().split()[0])

answer = sorted(list(no_watch & no_see))
print(len(answer))
for name in answer:
    print(name)