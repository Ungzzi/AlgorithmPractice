import sys

N, M = map(int, sys.stdin.readline().split())
j_list = [int(sys.stdin.readline()) for _ in range(M)]
j_list.sort()

start = 1
end = max(j_list)

while start <= end:
    mid = (start + end) // 2  # 질투심 기준
    sum = 0

    for jewel in j_list:
        if jewel % mid == 0:
            sum += jewel // mid
        else:
            sum += jewel // mid + 1

    if sum > N:  # 보석 받은 인원이 기준을 초과하여, 질투심을 높여야함
        start = mid + 1
    else:
        end = mid - 1
print(start)