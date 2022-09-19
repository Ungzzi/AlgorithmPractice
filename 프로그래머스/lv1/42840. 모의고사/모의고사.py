def solution(answers):
    answer = []
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = [0, 0, 0]
    max_win = 0

    for i in range(len(answers)):
        if a[i % 5] == answers[i]:
            cnt[0] += 1

        if b[i % 8] == answers[i]:
            cnt[1] += 1

        if c[i % 10] == answers[i]:
            cnt[2] += 1

    for i in range(len(cnt)):
        if cnt[i] > max_win:
            max_win = cnt[i]
            answer = [i+1]
        elif cnt[i] == max_win:
            answer.append(i+1)

    return answer