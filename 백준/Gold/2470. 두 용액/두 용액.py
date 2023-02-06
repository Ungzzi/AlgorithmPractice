import sys

N = int(sys.stdin.readline())
arr = sorted(list(map(int, sys.stdin.readline().split())))

start = 0
end = N-1
min_sum = 2_000_000_001
result = [0, 0]

while start < end:
    mid = arr[start] + arr[end]

    if abs(mid) < min_sum:
        min_sum = abs(mid)
        result = [arr[start], arr[end]]

    if mid < 0:
        start += 1
    elif mid > 0:
        end -= 1
    else:
        break

print(result[0], result[1])
