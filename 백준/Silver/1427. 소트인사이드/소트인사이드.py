import sys

n = sys.stdin.readline().rstrip()
n = ''.join(sorted(n, reverse=True))

print(n)