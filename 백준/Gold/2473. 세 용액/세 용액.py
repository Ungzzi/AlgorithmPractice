import sys

N = int(sys.stdin.readline())
arr = sorted(list(map(int, sys.stdin.readline().split())))
min_sum = 3_000_000_001
result = [0, 0]

for i in range(N-2):
    start = i + 1
    end = N-1

    while start < end:
        mid = arr[start] + arr[end] + arr[i]

        if abs(mid) < min_sum:
            min_sum = abs(mid)
            result = [arr[start], arr[end], arr[i]]

        if mid < 0:
            start += 1
        elif mid > 0:
            end -= 1
        else:
            break

result.sort()
print(result[0], result[1], result[2])