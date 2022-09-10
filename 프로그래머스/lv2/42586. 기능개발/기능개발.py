from collections import deque


def solution(progresses, speeds):

    progresses = deque(progresses)
    speeds = deque(speeds)
    done = []
    answer = []

    while progresses:

        for i in range(len(progresses)):
            progresses[i] += speeds[i]

        for j in range(len(progresses)):
            if progresses[0] >= 100:
                done.append(progresses.popleft())
                speeds.popleft()

            else:
                break

        if len(done) > 0:
            answer.append(len(done))
            done = []

    return answer