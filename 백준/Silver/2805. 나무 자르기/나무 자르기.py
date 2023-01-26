import sys
K, N = map(int, input().split())
lan = list(map(int, sys.stdin.readline().split()))
start, end = 1, max(lan)

while start <= end:
    mid = (start + end) // 2
    tot = 0
    for i in lan:
        wood = i - mid
        if wood > 0:
            tot += wood

    if tot >= N:
        start = mid + 1
    else:
        end = mid - 1
print(end)