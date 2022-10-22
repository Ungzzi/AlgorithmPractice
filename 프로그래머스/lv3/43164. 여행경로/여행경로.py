from collections import deque

def bfs(sp, tickets):
    q = deque()
    q.append([sp])
    li = []

    while q:
        cur = q.popleft()
        if len(cur) == len(tickets):
            li.append(cur)
            continue
        idx = cur[-1]

        for i in range(len(tickets)):
            if idx != i and i not in cur and tickets[idx][1] == tickets[i][0]:
                q.append(cur + [i])
    return li


def solution(tickets):
    answer = []
    t_order = []
    sp = []
    for i in range(len(tickets)):
        if tickets[i][0] == "ICN":
            sp.append(i)

    for idx in sp:
        t_list = bfs(idx, tickets)
        for t in t_list:
            t_order.append(t)

    for t in t_order:
        com = []
        for i in t:
            com.append(tickets[i][0])
        ep = t[-1]
        com.append(tickets[ep][1])
        answer.append(com)
    answer.sort()
    return answer[0]