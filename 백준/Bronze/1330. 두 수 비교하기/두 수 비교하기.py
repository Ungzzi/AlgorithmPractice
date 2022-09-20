import sys

n1, n2 = map(int, sys.stdin.readline().split())

if n1 > n2:
    print('>')
elif n1 < n2:
    print('<')
else:
    print('==')
