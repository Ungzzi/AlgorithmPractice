def solution(n, times):
    start = min(times)
    end = n * max(times)  # 가장 비효율적일 때

    # 총 심사 시간 기준 이분탐색
    while start <= end:
        mid = (start + end) // 2
        print(mid)
        people = 0  # 심사 받은 사람 수

        for time in times:
            people += mid // time
            if people >= n:
                break

        # 심사한 사람 수가 n보다 많거나 같은 경우
        if people >= n:
            end = mid - 1
        # 심사한 사람 수가 n보다 적은 경우
        elif people < n:
            start = mid + 1

    return start