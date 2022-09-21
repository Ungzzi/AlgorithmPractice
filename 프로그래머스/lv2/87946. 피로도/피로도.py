import itertools


def solution(k, dungeons):
    answer = 0
    cnt = 0

    order_list = list(itertools.permutations(dungeons))

    for fatigue in order_list:
        answer = max(answer, cnt)
        cur = k
        cnt = 0
        for i in range(len(fatigue)):
            if cur >= fatigue[i][0]:
                cnt += 1
                cur -= fatigue[i][1]
            else:
                break
    return answer