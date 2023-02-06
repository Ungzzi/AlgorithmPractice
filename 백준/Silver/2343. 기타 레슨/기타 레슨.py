import sys
N, M = map(int, sys.stdin.readline().split())
v_list = list(map(int, sys.stdin.readline().split()))

start = max(v_list)
end = sum(v_list)


def cnt_blu(mid):
    cnt = 0
    v_sum = 0

    for i in range(N):
        v_sum += v_list[i]
        if v_sum > mid:
            cnt += 1
            v_sum = v_list[i]
    return cnt + 1


while start <= end:
    mid = (start + end) // 2

    cnt = cnt_blu(mid)

    if cnt > M:
        start = mid + 1
    elif cnt <= M:
        end = mid - 1

print(start)