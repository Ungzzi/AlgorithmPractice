def solution(n, times):
    answer = 0

    start = min(times)
    end = n * max(times)

    while start <= end:
        mid = (start + end) // 2
        min_sum = 0

        for time in times:
            min_sum += mid // time
            if min_sum >= n:
                break

        if min_sum >= n:
            answer = mid
            end = mid - 1
        elif min_sum < n:
            start = mid + 1

    return answer
