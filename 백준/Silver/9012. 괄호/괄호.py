from collections import deque

n = int(input())

for i in range(n):
    bk = input()
    dq = deque()

    for c in bk:
        if c == "(":
            dq.append(c)
        elif c == ")":

            if len(dq) == 0 or dq.pop() == ")":
                dq.append(c)
                break

    if len(dq) == 0:
        print("YES")
    else:
        print("NO")
