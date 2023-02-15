def solution(distance, rocks, n):
    answer = 0
    rocks.sort()
    start, end = 0, distance

    while start <= end:
        mid = (start + end) // 2
        pre = 0
        del_rocks = 0

        for rock in rocks:
            if rock - pre < mid:
                del_rocks += 1
            else:
                pre = rock
            if del_rocks > n:
                break

        if del_rocks > n:
            end = mid - 1
        else:
            answer = mid
            start = mid + 1

    return answer