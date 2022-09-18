import heapq
from collections import deque


def solution(jobs):
    complete = 0
    working = False
    h = []
    heapq.heapify(h)
    t = 0
    jobs.sort()
    jobs_q = deque(jobs)
    while jobs_q:

        for i in range(len(jobs_q)):
            if t == jobs_q[i][0]:
                heapq.heappush(h, (jobs_q[i][1], jobs_q[i][0]))

        if h and working == False:
            work_h = heapq.heappop(h)
            work = work_h[0]
            work_t = 1
            working = True
            complete += (t - work_h[1]) + work

        if working == True:
            if work_t == work:
                working = False
                jobs_q.popleft()
            else:
                work_t += 1

        t += 1

    return complete // len(jobs)
