import sys

n = int(sys.stdin.readline())
l = []

for i in range(n):
    cmd = sys.stdin.readline().rstrip()

    if 'push' in cmd:
        p = cmd.split(' ')
        l.append(p[1])
    elif 'pop' in cmd:
        if len(l) < 1:
            print(-1)
        else:
            print(l.pop())
    elif cmd == 'size':
        print(len(l))
    elif cmd == 'empty':
        if len(l) == 0:
            print(1)
        else:
            print(0)
    elif cmd == 'top':
        if len(l) > 0:
            print(l[len(l)-1])
        else:
            print(-1)