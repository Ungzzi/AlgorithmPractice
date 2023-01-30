import sys

N, H = map(int, sys.stdin.readline().split())
obs = [int(sys.stdin.readline()) for _ in range(N)]
btm, top = [], []

for i in range(N):
    if i % 2 != 0:
        top.append(obs[i])
    else:
        btm.append(obs[i])

top.sort()
btm.sort()

min_cnt = N + 1
tot_cnt = 0

def binary(start, end, target, arr):
    while start <= end:
        mid = (start + end) //2

        if arr[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return start

for i in range(1, H+1):
    btm_cnt = N//2 - binary(0, len(btm)-1, i, btm)
    top_cnt = N//2 - binary(0, len(top)-1, H-i+1, top)
    cur_cnt = btm_cnt + top_cnt

    if cur_cnt == min_cnt:
        tot_cnt += 1

    elif cur_cnt < min_cnt:
        min_cnt = cur_cnt
        tot_cnt = 1

print(min_cnt, tot_cnt)