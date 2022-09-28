import heapq
import sys

h = []
heapq.heapify(h)
n = int(sys.stdin.readline())

for i in range(n):
    op = int(sys.stdin.readline())
    if op == 0:
        if len(h) == 0:
            print(0)
        else:
            print(-heapq.heappop(h))
    else:
        heapq.heappush(h, -op)