import sys

rep = int(sys.stdin.readline())
l = []

for i in range(rep):
    n = int(sys.stdin.readline())

    if n == 0:
        l.pop()
    else:
        l.append(n)

answer = sum(l)
print(answer)