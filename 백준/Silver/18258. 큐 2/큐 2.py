from collections import deque
import sys

n = int(sys.stdin.readline().strip())
q = deque()

for i in range(n):
    cmd = sys.stdin.readline().strip()
    if 'push' in cmd:
        q.append(cmd.split(' ')[1])
    elif cmd == 'pop':
        if len(q) > 0:
            print(q.popleft())
        else:
            print("-1")
    elif cmd == 'size':
        print(len(q))
    elif cmd == 'empty':
        if len(q) > 0:
            print("0")
        else:
            print("1")
    elif cmd == 'front':
        if len(q) > 0:
            print(q[0])
        else:
            print("-1")
    elif cmd == 'back':
        if len(q) > 0:
            print(q[-1])
        else:
            print("-1")
