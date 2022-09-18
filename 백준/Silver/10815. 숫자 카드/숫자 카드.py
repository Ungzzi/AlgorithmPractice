import sys
from collections import deque

N = int(sys.stdin.readline())
list_N = list(map(int, sys.stdin.readline().split(' ')))
M = int(sys.stdin.readline())
list_M = list(map(int, sys.stdin.readline().split(' ')))
_dict = {}

for i in range(N):
    _dict[list_N[i]] = i

for j in range(M):
    if list_M[j] not in _dict:
        print('0', end=' ')
    else:
        print('1', end=' ')
