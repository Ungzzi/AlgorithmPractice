import sys

N = int(sys.stdin.readline())
budget = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())

start = 1
end = max(budget)

while start <= end:
    mid = (start + end) // 2  # 상한액
    amt = 0

    for req in budget:
        if req < mid:
            amt += req
        else:
            amt += mid

    if amt <= M:
        start = mid + 1
    else:
        end = mid - 1

print(end)