import sys
from collections import deque

n = int(sys.stdin.readline())

for i in range(n):
    rep, arr = sys.stdin.readline().rstrip().split()

    for c in arr:
        print(int(rep)*c, end='')

    print("")