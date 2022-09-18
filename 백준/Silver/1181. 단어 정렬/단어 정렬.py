import sys
from collections import deque

n = int(sys.stdin.readline())
arr = []

for i in range(n):
    arr.append(sys.stdin.readline().rstrip())

arr = set(arr)
arr = list(arr)
arr.sort()
arr.sort(key=lambda x: len(x))

for c in arr:
    print(c)
