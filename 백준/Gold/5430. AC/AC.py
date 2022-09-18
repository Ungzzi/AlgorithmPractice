import sys
from collections import deque

t_case = int(sys.stdin.readline())

for c in range(t_case):
    cmd = sys.stdin.readline().split()[0]
    n = int(sys.stdin.readline())
    arr = deque(eval(sys.stdin.readline().split()[0]))
    rev = False
    err = False

    for i in range(len(cmd)):
        if cmd[i] == 'R' and rev == False:
            rev = True
        elif cmd[i] == 'R' and rev == True:
            rev = False
        elif cmd[i] == 'D':
            if len(arr) == 0:
                err = True
                break
            elif rev == False:
                arr.popleft()
            elif rev == True:
                arr.pop()

    if err == True:
        print("error")
    elif rev == True:
        arr.reverse()
        print('[' + ','.join(map(str, list(arr)))+']')
    elif rev == False:
        print('[' + ','.join(map(str, list(arr)))+']')
