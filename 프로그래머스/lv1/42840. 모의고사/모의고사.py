def solution(answers):
    answer = []
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = [0, 0, 0]
    max_win = 0

    for i in range(len(answers)):
        if i < 5 and a[i] == answers[i]:
            cnt[0] += 1
        elif a[i % 5] == answers[i]:
            cnt[0] += 1

        if i < 8 and b[i] == answers[i]:
            cnt[1] += 1
        elif b[i % 8] == answers[i]:
            cnt[1] += 1

        if i < 10 and c[i] == answers[i]:
            cnt[2] += 1
        elif c[i % 10] == answers[i]:
            cnt[2] += 1

    for i in range(len(cnt)):
        if cnt[i] > max_win:
            max_win = cnt[i]
            answer = [i+1]
        elif cnt[i] == max_win:
            answer.append(i+1)

    return answer