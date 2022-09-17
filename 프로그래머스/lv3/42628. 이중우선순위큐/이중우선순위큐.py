import heapq
from collections import deque


def solution(operations):
    answer = []
    h = []
    heapq.heapify(h)

    for op in operations:
        op = op.split(' ')
        if op[0] == 'I':
            heapq.heappush(h, int(op[1]))
        else:
            if op[1] == '-1' and len(h) > 0:
                heapq.heappop(h)
            elif op[1] == '1' and len(h) > 0:
                h = heapq.nlargest(len(h), h)[1:]
                heapq.heapify(h)

    if len(h) == 0:
        answer = [0, 0]
    else:
        answer.append(heapq.nlargest(1, h)[0])
        answer.append(heapq.heappop(h))
    return answer